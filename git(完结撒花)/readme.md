###github中如果有灰色的文件,表示文件夹中已有仓库,因为仓库中不能嵌套另一个仓库,必须删除此文件夹的仓库
### git reset --hard 删除修改
###git rm -r --cached  src			/删除src的版本控制
	git commit -m"移除src目录下所有文件的版本控制"    //提交
	git push origin master   //提交到远程服务器