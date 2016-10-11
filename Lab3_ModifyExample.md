# LAB3实验报告
<dr><dr><dr>

| 姓名 | 冯佳纯 | 班级 | 2014级M1班 |
|:---:|:------:|:----:|:-----------:|
| **学号** | 14353059|**QQ**|506717321|


## 1. 实验题目
 &emsp;&emsp;修改example2，让3个square模块变成2个, tips:修改xml的iterator
 &emsp;&emsp;修改example1，使其输出3次方数，tips:修改square.c

<br>
## 2. 实验步骤
### 2.1 修改example1
&emsp;&emsp;在理解了代码之后，可以看到square.c的代码中对i进行了运算，我修改了这部分运算，将运算改为i^8，然后将结果写到输出端口，修改具体如下图所示：
> **代码修改：** 
> <img style="width:60%;height:auto" src="http://i.imgur.com/tcImu9G.png">
<br>
> **未修改之前的运行结果：**
> 
> <img style="width:50%;height:auto" src="http://i.imgur.com/ypkF8by.png">
> <br>
> **修改之后的运行结果：**
> 
> <img style="width:50%;height:auto" src="http://i.imgur.com/WXK7u1T.png">

<br>
### 2.2 修改example2

&emsp;&emsp;在理解了代码之后，可以看到代码中是定义了一个迭代器，边界为变量N=3,然后声明了三个suqare模块。接着在connect部分，也声明了迭代器进行连接。因此，只需修改变量N的值，改为2即可奖3个square模块变为2个square模块。修改具体如下图所示：
> **代码修改：** 
> 
> <img style="width:60%;height:auto" src="http://i.imgur.com/6Cu01PJ.png">
<br>
> **未修改之前的运行结果：**
> 
> <img style="width:50%;height:auto" src="http://i.imgur.com/ArnR5Xu.png">
> <br>
> **修改之后的运行结果：**
> 
> <img style="width:50%;height:auto" src="http://i.imgur.com/YmvS32w.png">


<br><br>
## 3. 实验感想
&emsp;&emsp;本次实验重点在于理解dol的示例文档与模块编程。理解如何定义模块，如何定义通道，如何定义连接。因为是基于C语言的，所以还是比较好懂的。相对较难的是iterator的理解。但是也还好，所以此次实验没有太大的问题。

























