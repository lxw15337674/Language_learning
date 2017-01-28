##javaScript
	在一个页面中负责与用户进行交互
	javaScript注释与java注释相同
	特点:
		1.跨平台
		2.安全性.(javaScript的代码不能直接访问硬盘的内容)
	javaScript与java的区别:
		1.javaScript是属于网景公司的产品,java是sun公司的
		2.javaScript是基于对象的语言,java是面向对象的语言.
		3.javaScript是解释型语,java是解释,编译型语言.
		4.javaScript是弱类型语言,java是强类型语言
			javaScript声明变量不需要明确是何种数据类型,任何的变量都是使用一个关键字var去声明即可.
			java声明变量的时候必须明确该变量的数据类型. 
	javascript查看错误
		javaScript出现错误,网页会不显示.
		查看错误需要在浏览器中用F12调用开发者工具重新打开网页查看错误.
##javaScript组成部分:
	1.EMCAScript(基本语法)
	2.BOM(Browser object model)浏览器对象模型
	3.DOM
###EMCAScript(基本语法)
####编写javaScript的代码
	方式1:
		可以使用<Script>标签体内进行编写.
		格式:
			<script type="text/javascript">
			
					js代码;
		
			</script>
	方式2:引入外部的javaScript文件.
		格式:
			 <script src="1.js" type="text/javascript"/>
		注意:
			1.<script>是有开始标签和结束标签的.
			2.<如果<script>标签已经引入js文件,就不能再使用方式1
			
####javaScript常用的函数
	alert("显示的内容..");弹出框
	document.write("数据"); 输出数据
	
####javascript的变量声明
	与python变量声明相同
	格式:
		var 变量名 = 数据;
		
####javascript的数据类型：
	typeof 查看变量的数据类型。
	使用格式：
		typeof 变量名		
		
####javascript的数据类型：
	number 小数与整数
	string 字符串 注意： javascript中没有字符的概念，只有字符串，字符串可以写在单引号或双引号中。
	boolean 布尔数据类型，
	undefined  undefined代表该变量没有定义。
		注意:
			1.如果一个字符串是以0x开头，那么会把字符串中的内容当成十六进行的数据处理的。
			2.如果首位是0，那么就想祛除0再进行转换。
			
####字符串转数字
	parseInt()  可以把一个字符串转换成整数。
		原理:如果接收的字符串含有非数字的字符,那么parse方法会从字符串的首个字符开始寻找,一直到非数字字符位置,然后就使用前面的数字字符转换为数字.
	parseFloat() 可以把一个字符串转换成小数。
	
	IsNaN() 返回布尔值,判断字符串是否是一个数字.   NAN = not a number
		注意:
			不是一个数字返回true,是一个数字返回false
###运算符:	
	+(加法、正数、 连接符)
		true 是1. false是0
		例子:	
			document.write("hello"+1); // hello1

	除法：
		如果两个整数相除不能整数的时候结果还是小数。

	比较运算符
		比较时会先把字符串转化为数字,再进行比较.如果无法转换成数字则比较两个字符串的长度.

	逻辑运算符:	
		没有单与的。只有||与&&

	三目运算符	
		布尔表达式?值1:值2;
			
###控制流程语句
####if语句
		
	格式：
		if(判断条件){
			符合条件执行的代码	
		}	
	
	if语句的特殊之处： 
		1. 在javascript中的if语句条件不单止可以写布尔表达式，还可以写任何的数据。
		
		number  非0为true, 0为false.
		string  内容不能空是true， 内容空的时候是false。
		undefined：false
		NaN:    false

####选择语句： 
	特殊之处：
		1. 	在javascript中case后面可以跟常量与变量还可以跟表达式。
		
####for-in循环语句
	格式：
	for(var 变量名 in 遍历的目标){
		
		}
		
	for-in语句的作用：
		1. 可以用于遍历数组的元素。  注意： 使用for-in语句遍历数组元素的时候遍历出来是数组的下标。	
		2. 可以用于遍历对象的所有属性数据。 注意： 使用for-in语句遍历对象的属性的时候，遍历出来的是对象的属性名。

###with语句
	作用:在存取对象属性和方法时就不用重复指定参考对象.
	格式:
		with(对象){
			
		}
###函数
	格式：
		function 函数名(形参列表){
			函数体 ;	
		}
	注意的细节：
		1. 在 javascript中函数 定义形参时是不能使用var关键字声明变量 的。
		2. 在javascript中 的函数是没有 返回值类型 的，如果函数需要返回数据给调用者，直接返回即可，如果不需要返回则不返回。
		3. 在 javascript中是没有函数 重载 的概念 的，后定义的同名函数会直接覆盖前面定义同名函数。
		4. 在javascript中任何的函数内部都隐式的维护了一个arguments（数组）的对象，给函数 传递数据的时候，是会先传递到arguments对象中，
			然后再由arguments对象分配数据给形参的。
####字符串常用的方法：
	anchor（）   	创建一个锚点
	charAt()     	返回指定索引位置处的字符。
	charCodeAt() 	回一个整数，返回指定索引位置处的字符。的 Unicode 编码。
	fontxxx() 		添加各种font标签
		例如: fontcolor()  文本设置颜色.
	indexOf()    	返回 String 对象内第一次出现子字符串的字符位置
	italics()    	添加<i>标签,即设置文本斜体
	link()         	添加<a>标签,即设置超链接
	replace()      	返回根据正则表达式进行文字替换后的字符串的复制
	split()        	切割   
	Substr()       	截取子串
	toUpperCase()  	转大写
	toLowerCase    	转小写	
####数字常用的方法：	
	toString()  把数字转换成指定进制形式的字符串。
	toFixed()   指定保留小数位,而且还带四舍五入的功能。
Math对象常用的方法：
	 ceil 		向上取整
	 floor（）   向下取整
	 random()  随机数方法 //  产生的伪随机数介于 0 和 1 之间（含 0，不含 1），
	 round     四舍五入
####Date对象
	例子:
		var date = new Date();//获取到当前的系统时间
			document.write("年:"+date.getFullYear()+"<br/>")
			document.write("月:"+(date.getMonth()+1)+"<br/>")
			document.write("日:"+date.getDate()+"<br/>")
			document.write("时:"+date.getHours()+"<br/>")
			document.write("分:"+date.getMinutes()+"<br/>")
			document.write("秒:"+date.getSeconds()+"<br/>")
####循环执行代码方法
	window.setInterval("调用的代码",每隔指定的毫秒数)   
	例子:
		window.setInterval("getCurrentTime()",1000);
####数组
	数组属性与python相同,长度可以变化.
	concat()	把arr1与arr2的数组元素组成一个新的数组返回。
	join('分隔符')		使用指定的分隔符把数组中的元素拼装成一个字符串返回。
	pop()		移除数组中的最后一个元素并返回该元素。
	push()		将新元素添加到一个数组中，并返回数组的新长度值。
	shift()		移除数组中第一个元素，并且返回。
	slice()		指定数组 的开始索引值与结束索引值截取数组的元素，并且返回子数组。
	sort(排序方法) 排序,注意:一定要传入排序的方法
###自定义对象:
	在javascript没有类的概念，只要有函数即可创建对象。
	自定义对象的方式1： 使用无参的函数创建对象。
	
	例子：
		方式1:
			function Person(){}
			var p = new Person(); //创建了一个Person对象了
			p.id = 110;
			p.name = "狗娃";
		方式2：使用带参的函数创建对象。
			
			function Person(id,name){
				this.id = id;
				this.name = name;	
				this.say = function(){
					alert(name+"呵呵");	
				}
			}
			var p = new Person(110,"狗剩");	//创建对象

		方式3： 使用Object函数创建对象
		
			var p = new Object();
			p.id = 110;
			p.name = "铁蛋";
		
		方式4：使用字面量的方式创建.
		
			var p = {
				id:110,
				name:"狗娃",
				say:function(){
					alert(this.name+"呵呵");	
			}	
		}		。
####prototype(原型)
	作用:给函数添加额外的方法或属性.
	格式:
		functoin Array(){
			this.prototype = new Object();	
			this.getMax = function(){
		}
	}	
	细节：
		1.	prototype是函数(function)的一个必备属性(书面一点的说法是"保留属性")(只要是function,就一定有一个prototype属性)
		2.	prototype的值是一个对象
		3.	可以任意修改函数的prototype属性的值。
		4.	一个对象会自动拥有prototype的所有成员属性和方法。
###BOM
	浏览器对象模型中把浏览器的各个部分都是用了一个对象进行藐视,如果我们要操作浏览器的一些属性,可以通过浏览器对象模型的对象进行操作.
		window代表了一个新开的窗口
		location代表了地址栏对象
		screen代表整个屏幕的对象
####windows对象常用方法
	open() 打开一个新窗口
	resizeTo()  将窗口的大小更改为指定的宽度和高度值
	moveBy()	相对于原来的窗口移动指定的x,y值.
	moveTo()	移动窗口
	
	setInterval() 设置循环时间重复执行代码
	clearInterval()	根据一个任务的ID取消的定时任务.
	setTimeOut()	定时时间后执行指定的代码一次
####事件
	注册时间的方式:
		方式1:直接在html元素上注册
		
		方式2:可以js代码向找到对应的对象再注册.