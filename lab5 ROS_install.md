## lab5 ROS安装


### 1.1 首先配置Ubuntu 软件仓库
由于虚拟机本身软件仓库的设置就已经满足要求了，所以这一步可以省略。图片如下：
![](http://i1.piimg.com/4851/606a42a3b68214ae.png)


### 1.2 添加 sources.list
配置电脑使其能够安装来自 packages.ros.org的软件包。 ROS Jade 仅 支持Trusty (14.04)，本机刚好是14.04

	sudo sh -c 'echo "debhttp://packages.ros.org/ros/ubuntu $(lsb_release -sc) main" > /etc/apt/sources.list.d/ros-latest.list'


### 1.3 添加 keys
	sudo apt-key adv --keyserver hkp://pool.sks-keyservers.net --recv-key 0xB01FA116
**1.2 -1.3 命令执行结果结果如下图所示：**
![](http://p1.bqimg.com/4851/1459236555108b90.png)

### 1.4 安装
首先，根据网页提示，需要确认Debian软件包索引是最新的，执行以下命令:

	sudo apt-get update

接着，运行下列命令行安装，此次安装使用桌面完整版安装：

	 sudo apt-get install ros-jade-desktop-full
安装完成如下图所示：
![](http://i1.piimg.com/4851/058b9148b59a58a5.png)

### 1.5 初始化 rosdep
在开始使用ROS之前你还需要初始化rosdep。rosdep可以方便在你需要编译某些源码的时候为其安装一些系统依赖，同时也是某些ROS核心功能组件所必需用到的工具,运行以下两个命令：

	sudo rosdep init
	rosdep update


### 1.6 环境配置
接下来使用命令让每次打开一个新的终端时ROS环境变量都能够自动配置好（即添加到bash会话中），命令如下所示：
	 
	echo "source /opt/ros/jade/setup.bash" >> ~/.bashrc
	source ~/.bashrc

### 1.7 安装 rosinstall
rosinstall 是ROS中一个独立分开的常用命令行工具，它可以方便让你通过一条命令就可以给某个ROS软件包下载很多源码树。
要在ubuntu上安装这个工具，请运行：

	sudo apt-get install python-rosinstall
**1.6-1.7 成功安装结果如图所示：**
![](http://p1.bqimg.com/4851/472dd9b51fe9946f.png)

### 1.8 测试安装
 安装ROS成功后,在Beginner Tutorials中有一个简单的示例程序。接下来试用以下命令测试是否安装成功。
#####  1. 初始化ROS环境,全局参数,以及每个节点注册等工作.
 在Terminal中输入下诉命令：
 
	 roscore
结果如下图所示：
![](http://p1.bqimg.com/4851/38f2dc95653dd001.png)

##### 2.  再打开一个Terminal,输入下诉命令.开启一个小乌龟界面.
	rosrun turtlesim turtlesim_node
![](http://i1.piimg.com/4851/1557562e6b92d522.png)

##### 3.  再打开一个Terminal,输入下诉命令.接受键盘输入,控制小乌龟移动.
	rosrun turtlesim turtle_teleop_key
![](http://i1.piimg.com/4851/8d0eb279c34dcec5.png)

选中最后打开的Terminal,键盘按下上下左右按键,就可以看到控制小乌龟移动了。


##### 4. 再打开一个Terminal,输入下诉命令,可以看到当前ROS nodes以及Topic等图形展示.
	rosrun rqt_graph rqt_graph
![](http://i1.piimg.com/4851/9ab4a26be5b65ee8.png)


至此，ROS的安装就完成了。