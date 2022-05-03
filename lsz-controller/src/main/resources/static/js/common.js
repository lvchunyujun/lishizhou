/*<![CDATA[*/
/** 加载菜单隐藏事件 */
$(document).ready(function(){
        $(".menu_img_ctl_left").click(function () {
            // $("._sjz_menu").hide({duration: 50,easing:'linear'});
            $(".sjz_menu").css("display","none");
            $("._sjz_menu").animate({ left:'0px', opacity:'1', height:'100%', width:'0px' });
            $("._sjz_menu").next().css("width","100%");
            $(".menu_img_ctl_right").show();
            $(this).hide();
        });
        $(".menu_img_ctl_right").click(function () {
            // $("._sjz_menu").show({duration: 50});
            $("._sjz_menu").animate({ left:'0px', opacity:'1', height:'100%', width:'15%' });
            $("._sjz_menu").next().css("width","85%");
            $(".sjz_menu").css("display","block");
            $(".menu_img_ctl_left").show();
            $(this).hide();
        });


});
/*]]>*/