create table Products
(
	Product_ID varchar(15) primary key,
	Product_Name varchar(20),
	Category varchar(15),
	Unit_Price varchar(10),
	Stock int
);
select * from Products

insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values ('P1001','Transcend 16 GB','USB Drive','800 Taka','12')
insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values ('P1002','Transcend 8 GB','USB Drive','500 Taka','12')
insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values ('P1003','Adata 16 GB','USB Drive','800 Taka','10')
insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values ('P1004','Adata 8 GB','USB Drive','500 Taka','10')
insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values ('M1005','A.Tech','Mouse','500 Taka','8')
insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values ('M1006','Logitech','Mouse','600 Taka','12')
insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values ('K1007','Logitech','Keyboard','500 Taka','14')
insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values ('K1008','A4Tech','Keyboard','400 Taka','12')