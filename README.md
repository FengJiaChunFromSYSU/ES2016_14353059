# DOL配置文档

## 1. 安装必要的环境
1.1. Ant是一种基于Java的build工具， 用Java的类来扩展，本身是这样一个流程脚本引擎，用于自动化调用程序 完成项目的编译打包，测试等。
	而JAVA与JAVAC是运行编译JAVA程序的。以下是在Ubantu虚拟机上的环境安装语句：
```
 sudo apt-get update 
 sudo apt-get install ant 
 sudo apt-get install openjdk-7-jdk 
 sudo apt-get install unzip
```
1.2. 获取systemc-2.3.1 与dol的安装包
```
sudo wget http://www.accellera.org/images/downloads/standards/systemc/systemc-2.3.1.tgz
sudo wget http://www.tik.ee.ethz.ch/~shapes/downloads/dol_ethz.zip
```

## 2.解压文件
2.1 新建dol文件夹
```  
mkdir dol 
```
2.2 将dolethz.zip解压到 dol文件夹中
```
unzip dol_ethz.zip -d dol 
```

2.3 解压systemc 
```
tar -zxvf systemc-2.3.1.tgz
```
			
## 3. 编译systemc
3.1 解压后进入systemc-2.3.1的目录下
```
cd systemc-2.3.1 
```
3.2 新建一个临时文件夹objdir 
```
mkdir objdir 
```
3.3 进入该文件夹objdir 
```
cd objdir 
```
3.4 运行configure(能根据系统的环境设置一下 参数，用于编译) 
```
../configure CXX=g++ --disableasync-updates 
```
下图为运行configure之后的截图![run_config](http://i.imgur.com/iBna8yj.png)

3.5 编译
```
 sudo make install
```
3.6 记录当前的工作路径(会输出当前所在路径，记下来，待会有用) 
```
pwd
```
	

## 4. 编译dol
4.1 编译dol 进入刚刚dol的文件夹 
``` 
cd ../dol 
```
4.2 修改build_zip.xml文件 找到下面这段话，就是说上面编译的systemc位置在哪里
```
 <property name="systemc.inc" value="YYY/include"/> 
<property name="systemc.lib" value="YYY/lib-linux/libsystemc.a"/> 
```
**把YYY改成上页pwd的结果（注意，对于  64位 系统的机器，lib-linux要改成lib-linux64)**

4.3 然后是编译
```
ant -f build_zip.xml all
```
若成功会显示build successful![build_success](http://i.imgur.com/vq3Efun.png)

4.4 接着可以试试运行第一个例子,进入build/bin/mian路径下 
```
 cd build/bin/main
```
4.5 然后运行第一个例子
```
 ant -f runexample.xml -Dnumber=1
```
成功结果如图![dol_success](http://i.imgur.com/hKgGXps.png)
		
4.6 如果最后一步编译不成功，则在4.2步骤之后，4.3步骤之前，插入以下语句,接着执行4.3-4.5步骤即可。
```
getdit build_zip.xml
```
