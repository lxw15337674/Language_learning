###github中如果有灰色的文件,表示文件夹中已有仓库,因为仓库中不能嵌套另一个仓库,必须删除此文件夹的仓库
### git reset --hard 删除修改
###git rm -r --cached  src			/删除src的版本控制
	git commit -m"移除src目录下所有文件的版本控制"    //提交
	git push origin master   //提交到远程服务器
###add
	git add . ：他会监控工作区的状态树，使用它会把工作时的所有变化提交到暂存区，包括文件内容修改(modified)以及新文件(new)，但不包括被删除的文件。
	git add -u ：他仅监控已经被add的文件（即tracked file），他会将被修改的文件提交到暂存区。add -u 不会提交新文件（untracked file）。（git add --update的缩写）
	git add -A ：是上面两个功能的合集（git add --all的缩写）