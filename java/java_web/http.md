### httpЭ��
	����� ------> ������  ����(request)
	������ ------> �����  ��Ӧ(response)
	
	tcp/ipЭ��: ��ע���ǿͻ����������֮�������Ƿ���ɹ�
	httpЭ��: ��������ͻ������������֮������ݴ���ĸ�ʽ�淶.
				����tcp/ipЭ��֮ǰ��װ��һ��Э��.
#### �鿴httpЭ��Ĺ���	
	chrome--> F12--> Network--> Headers
#### httpЭ������
	���������-����������
		GET /day09/hello HTTP/1.1
		Host: localhost:8080
		User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; rv:35.0) Gecko/20100101 Firefox/35.0
		Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
		Accept-Language: zh-cn,en-us;q=0.8,zh;q=0.5,en;q=0.3
		Accept-Encoding: gzip, deflate
		Connection: keep-alive
	
	��Ӧ��������-���������
		HTTP/1.1 200 OK
		Server: Apache-Coyote/1.1
		Content-Length: 24
		Date: Fri, 30 Jan 2015 01:54:57 GMT

		this is hello servlet!!!
### http����(request)
	-������
		GET /day09/hello HTTP/1.1        
	-����ͷ
		Host: localhost:8080                  
		User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; rv:35.0) Gecko/20100101 Firefox/35.0
		Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
		Accept-Language: zh-cn,en-us;q=0.8,zh;q=0.5,en;q=0.3
		Accept-Encoding: gzip, deflate
		Connection: keep-alive
	-һ������
	
	-����ѡ��ʵ������
		name=eric&password=123456  
		
#### ������
	���������ͻ��˵�����ʽ,�������Դ����,�Լ�ʹ�õ�HTTPЭ��汾��.
		����: GET /day09/hello HTTP/1.1 
		
	httpЭ��汾
		http1.0����ǰ������ͻ�����������˽�������֮��ֻ�ܷ���һ������һ������֮�����ӹرա�
		http1.1����ǰ������ͻ�����������˽�������֮�󣬿�����һ�������з��Ͷ�����󡣣�������ʹ��1.1��
	
	������Դ
		URL:ͳһ��Դ��λ��,ֻ�ܶ�λ��������Դ����URI���Ӽ���
			http://localhost:8080/day09/testImg.html��
		URI: ͳһ��Դ��Ƿ���/day09/hello�����ڱ���κ���Դ�������Ǳ����ļ�ϵͳ��Ҳ�����ǻ�������
	
	����ʽ
		���õ�����ʽ�� GET  �� POST	
			���ύ��
				<form action="�ύ��ַ" method="GET/POST">	
					
				<form>
	GET��Post����
		Get��ʽ�ύ
			1.��ַ��(URI)����ϲ�������.��?��ͷ,�������֮����&�ָ�.
			2.Get�ύ��������������,������1kb
			3.Get��ʽ���Ǻ��ύ��������.
			4.ע��:�����ֱ�ӷ��ʵ�����,Ĭ���ύ��ʽ��GET��ʽ.
		Post��ʽ�ύ:
			1.�����������URI����,�������Ǹ��������ʵ��������.
			2.POST�ύ�Ĳ�������û�����ơ�
			3.POST��ʽ�ύ�������ݡ�
#### ����ͷ
	�ɶ��key-value����, ���������ͻ�������������Ϳͻ��˵�һЩ������Ϣ.
		Accept: text/html,image/*      -- ��������ܵ���������
		Accept-Charset: ISO-8859-1     -- ��������ܵı����ʽ
		Accept-Encoding: gzip,compress  --��������ܵ�����ѹ����ʽ
		Accept-Language: en-us,zh-       --��������ܵ�����
		Host: www.it315.org:80          --������ģ���ǰ������ʵ�Ŀ���ַ������:�˿ڣ�
		If-Modified-Since: Tue, 11 Jul 2000 18:23:51 GMT  --��������Ļ���ʱ��
		Referer: http://www.it315.org/index.jsp      -- ��ǰ��������������
		User-Agent: Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0)  --���������
		Cookie:name=eric                     -- ����������cookie��Ϣ
		Connection: close/Keep-Alive            -- �����������������״̬��close: ���ӹر�  keep-alive���������ӡ�
		Date: Tue, 11 Jul 2000 18:23:51 GMT      -- ���󷢳���ʱ��
#### ʵ������	
	ֻ��POST�ύ�Ĳ�����ŵ�ʵ��������

#### Http��Ӧ(response)
	��Ӧ��
		HTTP/1.1 200 OK
	��Ӧͷ
		Server: Apache-Coyote/1.1
		Content-Length: 24
		Date: Fri, 30 Jan 2015 01:54:57 GMT
	һ������
	
	ʵ������
		this is hello servlet!!!
#### ��Ӧ��
	httpЭ��汾
		״̬��:��������������Ľ��(״̬)
			���õ�״̬:
				200: ��ʾ��������ɲ���������
				302: ��ʾ������Ҫ��һ��ϸ��.�ض���
				303: ��ʾ���ʵ���Դ�Ҳ��� 
				500: ��ʾ����������Դ���ʹ���.(�������ڲ�����).
#### ��������Ӧͷ
	Location: http://www.it315.org/index.jsp   -��ʾ�ض���ĵ�ַ����ͷ��302��״̬��һ��ʹ�á�
	Server:apache tomcat                 ---��ʾ������������
	Content-Encoding: gzip                 -- ��ʾ���������͸������������ѹ������
	Content-Length: 80                    --��ʾ���������͸�����������ݳ���
	Content-Language: zh-cn               --��ʾ������֧�ֵ�����
	Content-Type: text/html; charset=GB2312   --��ʾ���������͸���������������ͼ����ݱ���
	Last-Modified: Tue, 11 Jul 2000 18:23:51 GMT  --��ʾ��������Դ������޸�ʱ��
	Refresh: 1;url=http://www.it315.org     --��ʾ��ʱˢ��
	Content-Disposition: attachment; filename=aaa.zip --��ʾ��������������ط�ʽ����Դ�������ļ�ʱ�õ���
	Transfer-Encoding: chunked
	Set-Cookie:SS=Q0=5Lb_nQ; path=/search   --��ʾ���������͸��������cookie��Ϣ���Ự�����õ���
	Expires: -1                           --��ʾ֪ͨ����������л���
	Cache-Control: no-cache
	Pragma: no-cache
	Connection: close/Keep-Alive           --��ʾ�������������������״̬��close���ر����� keep-alive:��������

		
