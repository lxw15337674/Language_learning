####���������
	b = ++a����a=a+1,b=a
	b = a++����b=a,a=a+1
####�߼������
	&&,& ��   &Ϊ�ж��������ʽ,&&�����boolean���ͽ����ж�,����һ�����ʽΪfalse��ȥ�жϵڶ������ʽ.
	||   ��
	!    ��
####��Ԫ�����
	����ʽ?ֵ1:ֵ2
	�������ǵ�ֵΪtrue,���������ʽȡֵ1,����ȡֵ2.
####�ַ�������:
	str.trim()����ǰ�ͺ�ո�
	str.equals(String otherstr)�Ƚ������ַ����Ƿ���ͬ. str.equalsIgnoreCase(String otherstr)���Դ�Сд�Ƚ�
	str.toLowerCase()���ַ���תΪСд str.toUpperCase()���ַ���תΪ��д
	str.split(String sign) ���ݷָ������ַ������в�� split(String sign,int limit)���޶���ֵĴ���
	str.format(String format,Object...args)
####format()��ʽ���ַ���
		��: String s = String.format("%tc",date)
	1.ʱ�� 
		 ת����:˵��:ʵ��
		  %tF	"��-��-��"						2008-03-25
		  %tD 	"��/��/��"						03/25/08
		  %tc	ȫ�����ں�ʱ����`Ϣ				������ ���� 25 12:07:28 CST 2016
		  %tr 	"ʱ:��:�� PM(AM)"(12ʱ��)		03:22:06 ����
		  %tT	"ʱ:��:�� "(24ʱ��)				15:23:50
		  %tr	"ʱ:��"(24ʱ��)					15:25
	2.����
		  %b,%B		��������
		  %s,%S		�ַ�������
		  %c,%C		�ַ�(char)����
		  %d		ʮ��������
####������ʽ
		.			����һ���ַ�
		\\d			0-9������һ������
		\\D			����һ���������ַ�
		\\s			�հ��ַ�
		\\s			�ǿհ��ַ�
		\\w			��������ʶ�����ַ�
		\\W			�������ڱ�ʶ�����ַ�
		\\p{Lower}	Сд��ĸ
		\\p{Upper}	��д��ĸ
		\\p{Alpha}	��ĸ
		\\p{Digit}	ʮ��������
		\\p{Alnum}	���ֻ���ĸ�ַ�
		\\p{Punct}	������
		\\p{Blank}	����ո�
		
		[^456]		4,5,6֮����κ��ַ�
		[a-r]		a-r�е�����һ����ĸ
		[a-zA-Z]	����һ��Ӣ����ĸ
		[a-e[g-z]]	a-e,��g-z�е��κ�һ����ĸ(������)
		[a-o&&[def]] ��ĸd,e,f
		[a-d&&[^dc]] ��ĸa,d
		
		�޶����η�
		?			0�λ�1��
		*			0�λ���
		+			1�λ���
		{n} 		���ó���n��
		{n,}		���ٳ���n��
		{n,m}		����n-m��
	
			����:E-mail��ʽ:X@X.com.cn
				\\w+@\\w+(\\.\\w+)*\\.\\w+ 
				\\wƥ�������ַ�
				����"+"��ʾ�ַ����Գ���1�λ���
				(\\.\\w+)* ��ʾ����".com"��ʽ���ַ������Գ���0�λ���.
				\\.\\w+    ����ƥ��E-mail��ַ�еĽ�β�ַ�,��".cn"
####���麯��
	�赼��import java.utill.Arrays
	1.����滻����Ԫ��
		fill(int[]a,int value) ��ָ����intֵ�����int�������ÿ��Ԫ��
		fill(int[]a,int fromindex,int toindex,int value)��ָ����intֵ�����int������ָ����Χ�е�ÿ��Ԫ��.���ķ�Χ��fromindex��toindex.
	2.����
		Arrays.sort(object) �����㷨�Ǹ����ֵ����˳������,�������������ĸǰ��,��д��ĸ����Сд��ĸǰ��.
	3.��������
		copyOf(arr,int newlength) newlengthָ���ƺ��������ĳ���,��������鳤�ȴ���arr����,��0���.
		copyOfRange(arr,int formlndex,int toindex)	
	4.�����ѯ
		binarySearch()ʹ�ö���������(���Ա�����ͨ��sort()�����������������)������ָ������.��������ڷ���-1��"-"(�����).���������������Ҫ�����������һ��.����һ�����ڴ˼���Ԫ������.
			binarySearch(Object[]a.Object key) a:Ҫ���������� key:Ҫ������ֵ
			binarySearch(object[].a,int fromindex,int toindex,object key)
####Ȩ�����η�
	���ʱ�λ��			private 	protected		public
	����				�ɼ�		�ɼ�			�ɼ�
	ͬ�������������	���ɼ�		�ɼ�			�ɼ�
	���������������	���ɼ� 		���ɼ�			�ɼ�
	��������ʱ��ʹ�����η��������Ȩ��,�������Ԥ��Ϊ����ȡ��Χ,��ֻ��һ�����е�����Ե��������ĳ�Ա�������Ա����.
####��̬��Ա ,����ȫ�ֱ���
		����:static int id
	���ܽ��������ڵľֲ���������Ϊstatic
		����:
			public class example{
				public void method(){
					static int = 0;
				}
			}
	������static����һ����̬����:
			public class example{
				static{
				}
			}
			
	��̬����:	
		����:public static lol(){
			}	
	�ھ�̬�����в�����ʹ��this�ؼ���.������ֱ�ӵ��÷Ǿ�̬����.
####Integer 
		1.Integer.toString(int x)			��ȡx��ʮ���Ʊ�ʾ
				.toBinaryString(int x) 	��ȡ������
				.toHexString(int x)	 	��ȡʮ������
				.toOctalString(int x)	��ȡ���ֵİ˽���
		2.intValue() ��int�ͷ��ش�Integer����
		3.����
			MAX_VALUE:��ʾint���Ϳ�ȡ�����ֵ,��2**31-1.
			MIN_VALUE:��ʾ��Сֵ,��-2**31
####���ִ���
		Math.pow(x,y)		ȡx��y�η�
		Math.max(x,y)		ȡx,b�����ֵ
		Math.abs(x)			ȡx�ľ���ֵ
		Math.random()		0��1֮���double������
####object��
		getClass().getName(),���ذ���.����
		����:
			public static int add(int a,int b){};
			�������������,����ʹ��:public static int(int...a){};
####final
		static final���ڶ��峣��   static final double a = 3;
		final �಻�ܱ��̳�         final class FinalClass{}
####try���
		try...catch...finally
####��ȡ��Դ�ļ���URL·��
		java.class.getResource()
###swing ����
	��Ϊ4��:���Բ���,������,�߽粼��,���񲼾�
####���Բ��ֲ���:
		1.ʹ��Container.setLayout(null)ȡ�����ֹ�����
		2.ʹ��Container.setBounds()����ÿ������Ĵ�С��λ��.
####������
		public FlowLayout(int alignment,int horizGap,int vertGap)   
			alignment������ʾʹ�������ֹ������������ÿһ�еľ���ڷ�λ��.LEFT = 0,CENTER = 1,RIGHT = 2
			������������ʾˮƽ����봹ֱ���.
###������
####list�ӿڵ�������
	1.arraylist,ʵ�ֿɱ������.�ŵ�:���ʿ�.ȱ��:�����ɾ���ٶȽ���
	2.Linkedlist,��������ṹ.�ŵ�:�����ɾ���ٶȿ�,ȱ��:������
	����:List<E> list = new ArrayList<>(); 
			E:����Ϸ���java��������.����String
####set����
	set���ϲ������ظ�ֵ.
	1.HashSet,�ɹ�ϣ��֧��.����֤Set�ĵ���˳��,����nullԪ��
	2.TreeSet,��֤����,������Ȼ˳���������.
		TreeSet�����ӵķ���
			first()  ���ص�һ��Ԫ��
			last()	 �������һ��Ԫ��
			comparator() 	���ضԴ�Set�е�Ԫ�ؽ�������ıȽ���.�����Setʹ����Ȼ˳��,�򷵻�null
			headSet(E toElement)	����һ���µ�Set����,����toElement(������)֮ǰ�Ķ���
			subSet(E fromElement,E fromElement)	����fromElement(����)��fromElement(������)֮��Ķ���
			tailSet(E fromElement) ����֮��Ķ���
####Map����
	�ṩkey��value��ӳ��.map����valueΪnull
			��:Map<String,String> map = new HashMap<>()
		����:
			put(key,value) ���key��value��ӳ���ϵ
			containsKey(Object key)	�����ӳ������ƶ�key��ӳ���ϵ,�򷵻�true
			containsKey(Object value) 
			get(object key)  �������key,���ض�Ӧ��ֵ,���򷵻�null
			keySet()	����key�����γɵ�Set����
			values()	��������ֵ�����γɵ�Collection����
		Map�ӿڳ��õ�ʵ������HashMap��TreeMap.����ʹ��HashMap��,��Ϊ��HashMap��ʵ�ֵ�Map������Ӻ�ɾ��ӳ���ϵЧ�ʸ���.
			1.HashMap�ǻ��ڹ�ϣ���Map�ӿڵ�ʵ��,ͨ����ϣ�����ӳ���ϵ���п��ٲ���.����ʹ��nullֵ�ͼ�.�����뱣֤����Ψһ��.���಻��֤ӳ���˳��.
			2.TreeMap:������ϣ��Map�����еĶ������һ����˳��.�����,ɾ���Ͷ�λӳ���ϵʱ,TreeMap���HashMao�������Բ�.����TreeMap��ʵ�ֵ�Map�����е�ӳ���ϵ�Ǹ��ݼ�������һ����˳�����е�,��˲������������null.
		����ͨ��HashMap�ഴ��Map����,����Ҫ˳�����ʱ,�ڴ���һ����ͬ��TreeMap��ʵ��.
			treemap.putAll(map); #ȫ����Ӷ���
			
			
		
	
		  
		
	  
		
		 
	

	 
	
	