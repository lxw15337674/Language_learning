## css(层叠样式表)
	在一个页面中负责页面的数据样式
	css的注释:/*    */
#### 编写css代码的样式:
	第一种: 在style标签中编写css代码.
		格式:
			<style type ="text\css">
				编写css的代码.
			</style>
	第二种: 引入外部的css文件.
		方式1:使用link标签.
			格式:
				<link href="css文件的路径" rel="stylesheet">
		方式2:使用<style>引入
			格式:
				<style type="text/css">
					@import "css文件的路径";
				</style>
	第三种:直接在html标签使用style属性编写.	
#### 选择器
	1.标签选择器:找到对应的数据进行样式化.
		格式:
			标签名{
				样式1;样式2...
			}
		例子:
			div {
            background-color: greenyellow;
            color: red;
            font-size: 24px;
			}
	2.类选择器:首先给html标签指定对应的class属性值.
		格式:
			.class的属性值{
				样式1;样式2
			}
		例子:
			.two {
            background-color: red;
            color: white;
            font-size: 24px;
        }	
		注意:
			1.类选择器的class属性值一定不能以数字开头
			2.类选择器的样式是要优先于标签选择器的样式.
	3.ID选择器: 使用ID选择器首先要给html元素添加一个id的属性值.
		格式:
			# id属性值{
				样式1;样式2...
			}
		注意:
			1.ID选择器优先级是最高的,优于类选择器和标签选择器.
			2.ID的属性值也是不能以数字开头的
			3.ID的属性值在一个html页面中只能出现一次.
	4.交集选择器:就是对选择器1中的选择器2里面的数据进行样式化.
		格式:
			选择器1 选择器2{
				样式1,样式2...
				}	
		例子:
			div span{
            background-color: #923;
            font-size: 24px;
        }
	5.并集选择器: 对指定的选择器进行统一的样式化
		格式:
			选择器1 选择器2{
				样式1,样式2...
				}		
		例子:
			span,a{
            border-style: solid;
            border-color: #F00;;
        }
	6.通过选择器:匹配html中所有标签元素
		*{
			样式1;样式2..
		}
	7.伪类选择器:伪类选择器就是对元素处于某种状态下进行样式的.
		注意： 
			1. a:hover 必须被置于 a:link 和 a:visited 之后
			2. a:active 必须被置于 a:hover 之后
		例子:
			a:link{color:#F00} /* 没有被点击过---红色 */
			a:visited{color:#0F0} /*  已经被访问过的样式---绿色 */ 
			a:hover{color:#00F;} /* 鼠标经过的状态---蓝 */
	注意:
		特殊性:				
						显示权值最高的css样式
						标签的权值为1，类选择符的权值为10，ID选择符的权值最高为100。例如下面的代码：
								p{color:red;} /*权值为1*/
								p span{color:green;} /*权值为1+1=2*/
								.warning{color:white;} /*权值为10*/
								p span.warning{color:purple;} /*权值为1+1+10=12*/
								#footer .note p{color:yellow;} /*权值为100+10+1=111*/
		层叠:				
						层叠就是在html文件中对于同一个元素可以有多个css样式存在，当有相同权重的样式存在时，会根据这些css样式的前后顺序来决定，处于最后面的css样式会被应用。
		重要性:
						我们在做网页代码的时，有些特殊的情况需要为某些样式设置具有最高权值,这时候我们可以使用!important来解决。
								p{color:red!important;}
								p{color:green;}
								<p class="first">三年级时，我还是一个<span>胆小如鼠</span>的小女孩。</p>
#### 盒子模型
	盒子模型就是把一个html边框比作成一个盒子的边框,盒子模型要作用到操作数据与边框之间的距离或者是边框与边框之间的距离.
	盒子模型主要是用于操作内边距(padding)与外边距（margin）
	margin 	外边框
		Border	边框
			padding 内边距
#### css的定位：
	相对定位： 相对定位是相对于元素原本的位置进行移动的。
	使用方式：	position:relative
	
	绝对定位： 绝对定位是相对于整个页面而言。
		position:absolute; 
		top:200px;
		left:380px;
		
	固定定位：
		position:fixed; /* 固定定位: 固定定位是相对于整个浏览器而已的。 
		top:380px;
		left:1000px;
					
