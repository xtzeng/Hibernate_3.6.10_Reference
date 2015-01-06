create table t1 as select * from emp where 1 = 0;//只创建表结构不带数据
create table t2 as select * from emp where 1 = 1;//创建表结构并带数据
