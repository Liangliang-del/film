//导航栏下拉事件
$(function() { //onload事件	
	showHide();

	function showHide() {
		$("[name=show_hide]").hover(function() {
			//attr()是获取属性
			var classname = $(this).attr("class");
			var subid = classname + "_items";
			//元素显示
			$("#" + subid).slideDown();
		}, function() {
			var classname = $(this).attr("class");
			var subid = classname + "_items";
			//元素隐藏
			$("#" + subid).slideUp();
		});
	}

	//导航栏二级菜单的显示和隐藏
	subMenu();

	function subMenu() {
		$("#category .cate_item").hover(function() {
			$(this).children(".sub_cate_box").slideDown();
		}, function() {
			$(this).children(".sub_cate_box").slideUp();
		});
	}

	//分享到---
	sharemore();

	function sharemore() {
		var $shareMore = $(".share_more");
		var $parent = $shareMore.parent();
		var $b = $shareMore.children()
			//&lt(小于2)，过滤器
		var $child = $shareMore.prevAll(":lt(2)");
		var openflag = true;
		$shareMore.click(function() {
			if(openflag) {
				$b.addClass("backword"); //添加类
				//增加宽度，jQuery用css改变样式
				$parent.css('width', 200);
				$child.show();
			} else {
				$child.hide();
				$parent.css('width', 155);
				$b.removeClass(); //删除类
			}
			openflag = !openflag;
		})
	}

	//搜索栏事件
	search();

	function search() {
		//$("#txtSearch").on("keyup focus",function(){}).blur(function(){})
		$("#txtSearch").on("keyup focus", function() {
			//点击和获得焦点事件
			var val = this.value.trim();
			if(val) {
				$("#search_helper").slideDown();
			}
		}).blur(function() {
			$("#search_helper").slideUp();
		});
	};

	//小图移动效果
	moveminPic();

	function moveminPic() {
		//先找到两个按钮
		var $a = $("#preview>h1>a");
		var $ul = $("#icon_list");
		var imgCount = $ul.children("li").length; //图片数量
		var liwidth = $ul.children(":first").width(); //图片的宽度
		var showCount = 5;
		var $back = $a.first(); //获取第一个元素
		var $forward = $a.last(); //获取最后一个元素
		var count = 0; //统计点击了几次
		$forward.click(function() {
			$back.removeClass();
			$back.addClass("backward");
			if(count == (imgCount - showCount)) {
				return;
			}
			count++;
			if(count == (imgCount - showCount)) {
				$forward.attr("class", "forward_disabled"); //加上一个name属性，后面是属性名
			}
			$ul.css({
				//这是一个对象，后面不能加;
				left: -liwidth * count //图片的宽度*点击的次数就是整体图片移动的距离
			});
		});
		$back.click(function() {
			$forward.removeClass();
			$forward.addClass("forward");
			if(count == 0) {
				return;
			}
			count--;
			if(count == 0) {
				$back.attr("class", "backward_disabled");
			}
			$ul.css({
				left: -liwidth * count
			});
		});
	}

	//图片
	hoverMining();

	function hoverMining() {
		$("#icon_list>li").hover(function() {
			$(this).children().addClass("hoveredThumb");
			var src = $(this).children().attr("src").replace(".jpg", "-m.jpg");
			console.log(src);
			$("#mediumImg").attr("src", src);
		}, function() {
			$(this).children().removeClass();
		});
	}

	//放大镜效果
	bigImg();

	function bigImg() {
		var $mask = $("#mask"); //小黄块
		var $maskTop = $("#maskTop"); //透明层
		var $container = $("#largeImgContainer"); //大图容器
		var $mediumImg = $("#mediumImg"); //中图
		var $largeImg = $("#largeImg");
		var $loading = $("#loading");
		var $maskTopWidth = $maskTop.width();
		var $maskHeight = $maskTop.height();
		$maskTop.hover(function() {
			$mask.show(); //显示小黄块
			$container.show(); //显示大图容器
			//获取大图路径
			var src = $mediumImg.attr("src").replace("-m", "-l");
			console.log(src);
			//修改大图路径
			$largeImg.attr("src", src);
			//获取图片宽度
			$largeImg.on("load", function() {
				$container.css({
					width: $largeImg.width() / 2,
					height: $largeImg.height() / 2
				});
				$loading.hide();
				$largeImg.show();

				//鼠标移动事件
				$maskTop.mousemove(function(event) {
					var eventLeft = event.offsetX;
					var eventTop = event.offsetY;
					var left = eventLeft - $mask.width() / 2;
					var top = eventTop - $mask.height() / 2;
					if(left < 0) {
						left = 0;
					} else if(left > $maskTopWidth - $mask.width()) {
						left = $maskTopWidth - $mask.width();
					};
					if(top < 0) {
						top = 0;
					} else if(top > $maskHeight - $mask.height()) {
						top = $maskHeight - $mask.height();
					}
					$mask.css({
						left: left,
						top: top
					});
					left = -left * $largeImg.width() / $maskTop.width();
					top = -top * $largeImg.height() / $maskTop.height();
					$largeImg.css({
						left: left,
						top: top
					});
				});
			});
		}, function() {
			$container.hide();
			$mask.hide();
		});
	}

});