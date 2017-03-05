####生命周期:
	1.onCreate
	2.onStart
	3.onResume
	4.onPause
	5.onStop
	6.onDestory
####Bundle 用于aty之间传递变量,有两种方式
		生成:
			Bundle b = new Bundle()
			b.putString("name","lixiwang");
			b.putInt("age",2);
		使用:
			a = data.getString("name")
			
		1.  传入intent i中
				i.putExtras(b);
			获取
				Intent i = getIntent();
				Bundle data = i.getExtras();

		2   传入intent i中
				i.putExtra("data",b);
			获取
				Bundle data = i.getBundleExtra("data");