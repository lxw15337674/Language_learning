##DOM(Document object Model) 文档对象模型
	一个html页面被浏览器加载的时候,浏览器就会对整个html页面上的所有标签都会创建一个对应的对象进行描述,
####通过html元素的标签属性找节点。
	document.getElementById("html元素的id") 
	document.getElementsByTagName("标签名") 
	document.getElementsByName("html元素的name")
####设置内容
	innerHtml是用于设置标签体的内容的.
	value是用于设置标签的value属性值.
####文档树
	文档书的每个标签对象称作节点(Node)
	一个标签最多只有一个父标签,但可以由多个子标签
####通过关系(父子关系、兄弟关系)找标签。
		parentNode	获取当前元素的父节点。
		childNodes	获取当前元素的所有下一级子元素。获取的是一个数组.注意:获取子节点是包括了空文本或者是注释的.
		firstChild	获取当前节点的第一个子节点。
		lastChild	获取当前节点的最后一个子节点。
------------------------------------------------------------	
		nextSibling		获取当前节点的下一个节点。（兄节点）
		previousSibling	获取当前节点的上一个节点。（弟节点）
		
	我们可以通过标签的类型进行判断筛选：		
		文本节点的类型： 3
		注释的节点类型： 8
		标签节点的类型： 1
####创建字节入插入节点、设置节点的属性。
	document.createElement("标签名")		创建新元素节点
	elt.setAttribute("属性名", "属性值")	设置属性
	elt.appendChild(e)						添加元素到elt中最后的位置
	elt.removeChild(eChild)					删除指定的子节点
####插入目标元素的位置	 
	elt.insertBefore(newNode, oldNode);			添加到elt中，child之前。
		注意： elt必须是oldNode的直接父节点。	               
	elt.removeChild(child)					删除指定的子节点
		注意： elt必须是child的直接父节点。
####正则表达式
	创建方式:
		方式1:
			/正则表达式/模式
		方式2:
			newRegExp("正则表达式",模式);
	模式:
		g(全文查找出现的所有pattern)
		i(忽略大小写) 
	常用方法:
		test() 使用正则对象去匹配字符串 如果匹配成功返回true,否则false
		expc() 根据正则表达式去查找字符串符合规则的内容