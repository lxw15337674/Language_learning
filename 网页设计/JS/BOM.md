### BOM
	浏览器对象模型中把浏览器的各个部分都是用了一个对象进行藐视,如果我们要操作浏览器的一些属性,可以通过浏览器对象模型的对象进行操作.
		window代表了一个新开的窗口
		location代表了地址栏对象
		screen代表整个屏幕的对象
#### windows对象常用方法
	open() 打开一个新窗口
	resizeTo()  将窗口的大小更改为指定的宽度和高度值
	moveBy()	相对于原来的窗口移动指定的x,y值.
	moveTo()	移动窗口
	
	setInterval() 设置循环时间重复执行代码
	clearInterval()	根据一个任务的ID取消的定时任务.
	setTimeOut()	定时时间后执行指定的代码一次
#### 事件
	注册时间的方式:
		方式1:直接在html元素上注册
		
		方式2:可以js代码向找到对应的对象再注册.
		
	常用的事件：
		鼠标点击相关：
			onclick 在用户用鼠标左键单击对象时触发。 
			ondblclick 当用户双击对象时触发。 
			onmousedown 当用户用任何鼠标按钮单击对象时触发。 
			onmouseup 当用户在鼠标位于对象之上时释放鼠标按钮时触发。 

		鼠标移动相关：
			onmouseout  当用户将鼠标指针移出对象边界时触发。 
			onmousemove 当用户将鼠标划过对象时触发。 

		焦点相关的：
			onblur 在对象失去输入焦点时触发。 
			onfocus 当对象获得焦点时触发。

		其他：
			onchange 当对象或选中区的内容改变时触发。 
			onload 在浏览器完成对象的装载后立即触发。 
			onsubmit 当表单将要被提交时触发。 
#### 地址栏对象(Location)		
	href() : 设置以及获取地址栏的对象
	reload() 刷新当前的页面
#### Screen(屏幕)对象
	availHeight	获取系统屏幕的工作区域高度，排除 Microsoft Windows 任务栏。 	
	availWidth	获取系统屏幕的工作区域宽度，排除 Windows 任务栏。 	
	height		获取屏幕的垂直分辨率。 
	width		获取屏幕的水平分辨率。
