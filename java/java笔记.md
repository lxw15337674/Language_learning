####自增运算符
	b = ++a等于a=a+1,b=a
	b = a++等于b=a,a=a+1
####逻辑运算符
	&&,& 与   &为判断两个表达式,&&则针对boolean类型进行判断,当第一个表达式为false则不去判断第二个表达式.
	||   或
	!    非
####三元运算符
	条件式?值1:值2
	若条件是的值为true,则整个表达式取值1,否则取值2.
####字符串函数:
	str.trim()忽略前和后空格
	str.equals(String otherstr)比较两个字符串是否相同. str.equalsIgnoreCase(String otherstr)忽略大小写比较
	str.toLowerCase()将字符串转为小写 str.toUpperCase()将字符串转为大写
	str.split(String sign) 根据分隔符对字符串进行拆分 split(String sign,int limit)会限定拆分的次数
	str.format(String format,Object...args)
####format()格式化字符串
		例: String s = String.format("%tc",date)
	1.时间 
		 转换符:说明:实例
		  %tF	"年-月-日"						2008-03-25
		  %tD 	"月/日/年"						03/25/08
		  %tc	全部日期和时间信息				星期日 九月 25 12:07:28 CST 2016
		  %tr 	"时:分:秒 PM(AM)"(12时制)		03:22:06 下午
		  %tT	"时:分:秒 "(24时制)				15:23:50
		  %tr	"时:分"(24时制)					15:25
	2.常规
		  %b,%B		布尔类型
		  %s,%S		字符串类型
		  %c,%C		字符(char)类型
		  %d		十进制整数
####正则表达式
		.			任意一个字符
		\\d			0-9的任意一个数字
		\\D			任意一个非数字字符
		\\s			空白字符
		\\s			非空白字符
		\\w			可用作标识符的字符
		\\W			不可用于标识符的字符
		\\p{Lower}	小写字母
		\\p{Upper}	大写字母
		\\p{Alpha}	字母
		\\p{Digit}	十进制数字
		\\p{Alnum}	数字或字母字符
		\\p{Punct}	标点符号
		\\p{Blank}	代表空格
		
		[^456]		4,5,6之外的任何字符
		[a-r]		a-r中的任意一个字母
		[a-zA-Z]	任意一个英文字母
		[a-e[g-z]]	a-e,或g-z中的任何一个字母(并运算)
		[a-o&&[def]] 字母d,e,f
		[a-d&&[^dc]] 字母a,d
		
		限定修饰符
		?			0次或1次
		*			0次或多次
		+			1次或多次
		{n} 		正好出现n次
		{n,}		至少出现n次
		{n,m}		出现n-m次
	
			例如:E-mail格式:X@X.com.cn
				\\w+@\\w+(\\.\\w+)*\\.\\w+ 
				\\w匹配任意字符
				符号"+"表示字符可以出现1次或多次
				(\\.\\w+)* 表示形如".com"格式的字符串可以出现0次或多次.
				\\.\\w+    用于匹配E-mail地址中的结尾字符,如".cn"
####数组函数
	需导入import java.utill.Arrays
	1.填充替换数组元素
		fill(int[]a,int value) 将指定的int值分配给int型数组的每个元素
		fill(int[]a,int fromindex,int toindex,int value)将指定的int值分配给int型数组指定范围中的每个元素.填充的范围从fromindex到toindex.
	2.排序
		Arrays.sort(object) 排序算法是根据字典编排顺序排序,因此数字排在字母前面,大写字母排在小写字母前面.
	3.复制数组
		copyOf(arr,int newlength) newlength指复制后的新数组的长度,如果新数组长度大于arr长度,用0填充.
		copyOfRange(arr,int formlndex,int toindex)	
	4.数组查询
		binarySearch()使用二分搜索法(所以必须是通过sort()方法对数组进行排序)来搜索指定数组.如果不存在返回-1或"-"(插入点).插入点是搜索键将要插入数组的那一点.即第一个大于此键的元素索引.
			binarySearch(Object[]a.Object key) a:要搜索的数组 key:要搜索的值
			binarySearch(object[].a,int fromindex,int toindex,object key)
####权限修饰符
	访问报位置			private 	protected		public
	本类				可见		可见			可见
	同包其他类或子类	不可见		可见			可见
	其他包的类或子类	不可见 		不可见			可见
	当声明类时不使用修饰符设置类的权限,则这个类预设为包存取范围,即只有一个包中的类可以调用这个类的成员变量或成员方法.
####静态成员 ,用于全局变量
		例如:static int id
	不能将方法体内的局部变量声明为static
		例如:
			public class example{
				public void method(){
					static int = 0;
				}
			}
	可以用static定义一个静态区域:
			public class example{
				static{
				}
			}
			
	静态方法:	
		例如:public static lol(){
			}	
	在静态方法中不可以使用this关键字.不可以直接调用非静态方法.
####Integer 
		1.Integer.toString(int x)			获取x的十进制表示
				.toBinaryString(int x) 	获取二进制
				.toHexString(int x)	 	获取十六进制
				.toOctalString(int x)	获取数字的八进制
		2.intValue() 以int型返回此Integer对象
		3.常量
			MAX_VALUE:表示int类型可取的最大值,即2**31-1.
			MIN_VALUE:表示最小值,即-2**31
####数字处理
		Math.pow(x,y)		取x的y次方
		Math.max(x,y)		取x,b的最大值
		Math.abs(x)			取x的绝对值
		Math.random()		0到1之间的double型数字
####随机数
	Random r = new Random();
		r.nextInt(int n) 返回大于等于0小于n的随机整数
		r.nextDouble()   返回一个随机double值
		
	
		  
		
	  
		
		 
	

	 
	
	