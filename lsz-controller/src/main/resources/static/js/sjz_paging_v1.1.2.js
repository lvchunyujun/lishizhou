/*
* v1.0.2
*  修改：1. 需要后台接口支持 body传参；
*       2. table数据类型text 增加显示长度（show_length）超多15截取后边字符；
* */
/*<![CDATA[*/
// 1. init event;
$(document).ready(function(){
    if(!$.isEmptyObject(pageVo)){
        data_paging(pageVo.dPageNo,pageVo.dPageSize);
    }
});

//  2. loading data;
function data_paging(currentPage,pageSize){

    // get search criteria;
    var criteria = get_search_criteria(currentPage,pageSize);
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=UTF-8",
        url: pageVo.bUrl,
        data:criteria,
        dataType:'json',
        success:function(data){
            eciHandler(data);
        },
        error: function(XMLHttpRequest, textStatus, errorThrown){
            alert(textStatus+"  "+XMLHttpRequest.state());
        }
    });
}

//  3. parse data;
var eciHandler = function(resultData){
    // 1. 清除数据
    $("#"+pageVo.bootstrapDiv.id_).empty();

    var sjzEvt = resultData.data.voList;
    var TEXT_LENGTH_LIMIT = 20;

    if(sjzEvt !=null && sjzEvt.length > 0){
        var bootstrapDiv = $("#"+pageVo.bootstrapDiv.id_);
        <!-- -->
        for (var i = 0; i < sjzEvt.length ; i++){
            // root 元素
            var root_tag = document.createElement("tr");
            root_tag = $(root_tag).addClass(pageVo.rootDiv.class_);

            <!-- 隔行分色 -->
            if(i%2==1){
                root_tag.css("background-color","#edf8ff");
            }

            var obj = sjzEvt[i];
            var map = pageVo.voMapping;
            for(var key in map){

                var val_ = obj[key];

                var td_tag = document.createElement("td");
                // 文本类型
                if(map[key].tagType == 'text' || map[key].tagType == null){

                    TEXT_LENGTH_LIMIT = map[key].show_length !=null && map[key].show_length>0 ? map[key].show_length: TEXT_LENGTH_LIMIT;

                    if(val_ != null && val_.length > TEXT_LENGTH_LIMIT){
                        val_ = val_.substring(0,TEXT_LENGTH_LIMIT)+"……";
                    }
                    // 1 编号
                    td_tag = $(td_tag).text(val_);
                }
                // 日期文本类型
                if(map[key].tagType == 'text_datetime'){
                    val_ = typeof(val_) == 'undefined' ?"":new Date(val_).Format(map[key].dateFormat);
                    td_tag = $(td_tag).text(val_);
                }
                // 分类文本类型
                if(map[key].tagType == 'text_type'){
                    val_ = map[key].typeMap[val_];
                    td_tag = $(td_tag).text(val_);
                }
                // 超链接类型
                if(map[key].tagType == 'text_a'){
                    var text_a_ = document.createElement("a");
                    text_a_ =  $(text_a_).attr("href",val_);
                    var t_target_ = "_blank";
                    if(map[key].aTarget != null && map[key].aTarget !="" && map[key].aTarget.length > 0){
                        t_target_ = map[key].aTarget;
                    }
                    $(text_a_).attr("target",t_target_);

                    TEXT_LENGTH_LIMIT = map[key].show_length !=null && map[key].show_length>0 ? map[key].show_length: TEXT_LENGTH_LIMIT;
                    // 隐藏过多字符
                    if(val_ != null && val_.length > TEXT_LENGTH_LIMIT){
                        val_ = val_.substring(0,TEXT_LENGTH_LIMIT)+"……";
                    }

                    text_a_ =  $(text_a_).text(val_);
                    td_tag = $(td_tag).append(text_a_);
                }
                // 图标映射
                if(map[key].tagType == 'bg_img'){
                    val_ = map[key].typeMap[val_];
                    var bg_img = document.createElement("img");
                    bg_img = $(bg_img).attr("src","/images/"+val_+"");

                    if(map[key].img_class !=null && map[key].img_class.length > 0){
                        bg_img = $(bg_img).addClass(map[key].img_class);
                    }
                    td_tag = $(td_tag).append(bg_img);
                }
                // 超链接操作类型（操作类型）
                if(map[key].tagType == 'a_operation'){
                    var indexName = map[key].indexName;
                    // 6.1 操作  更新标签
                    if(map[key].updateHref !=null && map[key].updateHref != "" && map[key].updateHref.length > 0){
                        var td_event_opt_a_u = document.createElement("a");
                        td_event_opt_a_u = $(td_event_opt_a_u).attr("href",map[key].updateHref+obj[indexName]);
                        td_event_opt_a_u = $(td_event_opt_a_u).text(map[key].updateTxt);
                        td_tag = $(td_tag).append(td_event_opt_a_u);
                    }
                    // 6.2 分割符
                    td_tag = $(td_tag).append("&nbsp;|&nbsp;");
                    // 6 操作  删除标签
                    if(map[key].deleteHref !=null && map[key].deleteHref != "" && map[key].deleteHref.length > 0){

                        var td_event_opt_a_d = document.createElement("a");
                        // td_event_opt_a_d = $(td_event_opt_a_d).attr("href",map[key].updateHref+obj[indexName]);
                        td_event_opt_a_d = $(td_event_opt_a_d).text(map[key].deleteTxt);
                        td_event_opt_a_d = $(td_event_opt_a_d)
                            .attr("href","javascript:void(0);");


                        $(td_event_opt_a_d).bind("click",{url:map[key].deleteHref,id:obj[map[key].indexName]},delete_record);
                        td_tag = $(td_tag).append(td_event_opt_a_d);
                    }

                }

                // * 标签添加样式
                if(map[key].class_ !=null && map[key].class_.length > 0){
                    td_tag = td_tag.addClass(map[key].class_);
                }
                root_tag.append(td_tag);

            }

            bootstrapDiv.append(root_tag);

        }
    }
    link_paging(resultData.data.currentPage,resultData.data.pageCount,resultData.data.pageSize);
};

/**
 *  4. resolve paging button; 加载分页按钮
 * @param currentPage   当前页
 * @param countPage     总页数
 * @param pageSize      每页显示条数
 */
function link_paging(currentPage,countPage,pageSize){
    pageVo.dPageNo = currentPage;
    pageVo.dPageSize = pageSize;
    $("#previous_page").unbind("click");
    $("#next_page").unbind("click");
    $("#sjz_center_top_search_ input[type='button']").unbind("click");
    // step1: 已经到达首页
    if(currentPage == 1 && currentPage == countPage){
        $("#previous_page").click(function () {
            data_paging(currentPage,pageSize);
        });
        $("#next_page").click(function () {
            data_paging(currentPage,pageSize);
        });
    }else if(currentPage == countPage){
        $("#previous_page").click(function () {
            data_paging(currentPage-1,pageSize);
        });
        $("#next_page").click(function () {
            data_paging(currentPage,pageSize);
        });
    }else{
        $("#previous_page").click(function () {
            data_paging(currentPage-1,pageSize);
        });
        $("#next_page").click(function () {
            data_paging(currentPage+1,pageSize);
        });
    }

    // 按钮查询事件
    var search_button = $("#sjz_center_top_search_ input[type='button']").get(0);
    if(search_button!=null){
        $(search_button).click(function () {
            data_paging(1,pageSize);
        });
    }

    // 显示分页数据信息
    $("#sjz_page_info").text("(第"+(currentPage==null||currentPage==""||currentPage<1?"0":currentPage)+"页，共"
                                +(countPage==null||countPage==""||countPage<1?"0":countPage)+"页)");

}

/**
 * 5. delete event；
 * @param e
 */
function delete_record(e){

    if(confirm("您好，确定要删除["+e.data.id+"]记录！")){

        $.ajax({
            type: "post",
            url: e.data.url+e.data.id,
            dataType:'json',
            success:function(data){
                data_paging(pageVo.dPageNo,pageVo.dPageSize);
            },
            error: function(XMLHttpRequest, textStatus, errorThrown){
                alert(textStatus+"  "+XMLHttpRequest.state());
            }
        });
    }

}

function get_search_criteria(currentPage,pageSize){

    var criTags =  $("#sjz_center_top_search_ *[name]");

    var criteria = new Object();

    for(var i = 0 ; i < criTags.length ; i++ ){
        var jTag = $(criTags[i]);
        criteria[jTag.attr("name")]=jTag.val();
    }

    criteria.pageVo={"currentPage":currentPage,"pageSize":pageSize};

    return  JSON.stringify(criteria) ;
}

/*]]>*/