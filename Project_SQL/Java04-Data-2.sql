##青鸟最后一战 毕业项目 - 数据库：工厂_数据 - 库名： Factory_Data
DROP DATABASE `Factory_Data`;
CREATE DATABASE `Factory_Data`;
USE `Factory_Data`;

#						权限五张表
#新建表1： 权限表 jurisdiction	#	DROP TABLE `a_jurisdiction`;
CREATE TABLE `a_jurisdiction`(
	`jur_id`  		INT 		NOT NULL  AUTO_INCREMENT COMMENT '权限编号' PRIMARY KEY,
	`description` 		VARCHAR(255) 	DEFAULT NULL COMMENT '权限名称',
	`parent_jur_id`		INT  		NOT NULL COMMENT '权限父级编号',
	`jur_name` 		VARCHAR(100) 	NOT NULL COMMENT '权限url'
)ENGINE=INNODB COMMENT="权限表";
INSERT INTO `a_jurisdiction`(description,parent_jur_id,jur_name)
VALUES('基本资料',0,''),('物料资料',0,''),('往来资料',0,''),('采购管理',0,''),('销售管理',0,''),('库存管理',0,''),('帐款管理',0,''),
('部门设定',1,'html/departmentSet.html'),('人员设定',1,'html/personSet.html'),
('仓库',2,'html/entrepotSet.html'),('物料类别',2,'html/materialTypeSet.html'),('物料',2,'html/materialSet.html'),('计量单位',2,'html/metreingUnitSet.html'),
('客户类别',3,'html/clientTypeSet.html'),('客户',3,'html/clientSet.html'),('供应商类别',3,'html/supplierType.html'),('供应商',3,'html/supplierSet.html'),
('请购',4,'html/D_sww/purchaseRequest.html'),('询价',4,'html/D_sww/purchaseEnquiry.html'),('订单',4,'html/E_ljh/purchaseOrder.html'),('入库',4,'html/F_lqj/purchaseStorage.html'),('退货',4,'html/F_lqj/purchaseReturn.html'),('分摊',4,'html/E_ljh/purchaseApportion.html'),
('报价',5,'html/A_zp/salesPrice.html'),('订单',5,'html/B_dsh/salesOrder.html'),('出库',5,'html/A_zp/salesOutbound.html'),('退货',5,'html/B_dsh/salesReturn.html'),
('调拨',6,'html/H_yw/transferring.html'),('盘点',6,'html/H_yw/blitem.html'),('调价',6,'html/H_yw/changePriceBill.html'),
('预收',7,'html/C_gt/receive.html'),('应收',7,'html/C_gt/receivable.html'),('预付',7,'html/G_cyh/payment.html'),('应付',7,'html/G_cyh/copewith.html');
#新建表2： 职位表 position	#	DROP TABLE `a_position`;
CREATE TABLE `a_position`(
	`pos_id` 		INT 		NOT NULL AUTO_INCREMENT COMMENT '职位编号' PRIMARY KEY,
	`pos_name`		VARCHAR(50)	NOT NULL COMMENT '职位名称',
	`description` 		VARCHAR(255) 	DEFAULT NULL COMMENT '拼音简称'
)ENGINE=INNODB COMMENT="职位表";
INSERT INTO `a_position`(`pos_name`,`description`)
VALUES('总经理','zongjingli'),('直销部经理','zhishoubujingli'),('采购部经理','caigoubujingli'),
('储运部经理','chuyunbujingli'),('直销部员工','zhishoubuyuangong'),('采购部员工','caigoubuyuangong'),
('储运部员工','chuyunbuyuangong'),('会计','kuaiji'),('出纳','chuna');
#新建表： 员工表 staff		在下面
#新建表3： 权限职位关系表 jur_pos_relation	#	DROP TABLE `a_jur_pos_relation`;
CREATE TABLE `a_jur_pos_relation`(
	`pos_id`		INT 		NOT NULL COMMENT '职位编号',
	`jur_id`		INT    		NOT NULL COMMENT '权限编号'
)ENGINE=INNODB COMMENT="权限职位关系表";
INSERT INTO `a_jur_pos_relation`(pos_id, jur_id)
VALUES
(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),	#总经理
(2,14),(2,15),(2,5),				#直销部经理
(3,16),(3,17),(3,4),				#采购部经理
(4,2),(4,6),					#储运部经理
(5,5),						#直销部员工
(6,4),						#采购部员工
(7,6),						#储运部员工
(8,7);						#会计		#本项目中，出纳暂无权限
#新建表4： 用户职位关系表 sta_pos_relation	#	DROP TABLE `a_sta_pos_relation`;
CREATE TABLE `a_sta_pos_relation`(
	`staff_id` 		INT 		NOT NULL COMMENT '员工编号（主键 唯一）',
	`pos_id`		INT 		NOT NULL COMMENT '职位编号'
)ENGINE=INNODB COMMENT="用户职位关系表";
INSERT INTO `a_sta_pos_relation`(staff_id,pos_id)
VALUES(1,1),(2,1),(3,8),(4,9),
(5,2),(6,5),(7,5),		#直销部
(8,3),(9,6),(10,6),		#采购部
(11,4),(12,7),(13,7);		#储运部



##1.共用管理开账（共九步）
#第一步：人员资料（3） - 1.部门设定	# DROP TABLE `comdepartment`;
CREATE TABLE `comdepartment` (
  `DepartID` 		VARCHAR(8) 	DEFAULT NULL 	COMMENT '部门编号',
  `DepartName` 		VARCHAR(30) 	DEFAULT NULL 	COMMENT '部门名称',
  `EngName` 		VARCHAR(40) 	DEFAULT NULL 	COMMENT '英文名称',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `Female` 		SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `Male` 		SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `JobSch` 		VARCHAR(10) 	DEFAULT NULL 	COMMENT '',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `CalID` 		VARCHAR(10) 	DEFAULT NULL 	COMMENT '',
  `SalaryTypeID` 	VARCHAR(10) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comdepartment`(`DepartID`,`DepartName`,`EngName`,`Memo`,`Female`,`Male`,`JobSch`,`MergeOutState`,`CalID`,`SalaryTypeID`) 
VALUES ('01','财务部','accounting department','',0,0,'',0,'002',''),('02','直销部','','',0,0,'',0,'002',''),('03','渠道部','','',0,0,'',0,'002',''),
('04','服务中心','service center','',0,0,'',0,'002',''),('05','采购部','','',0,0,'',0,'002',''),('06','生产部','','',0,0,'',0,'001',''),
('07','研发部','Research and Development Department','',0,0,'',0,'002',''),('08','储运部','','',0,0,'',0,'001',''),('09','综合管理部','','',0,0,'',0,'002','');
#第一步：人员资料（3） - 2.学历设定	# DROP TABLE `hum_schooling`;
CREATE TABLE `hum_schooling` (
  `SchoolingID` 	VARCHAR(10) 	DEFAULT NULL 	COMMENT '学历编号',
  `SchoolingName` 	VARCHAR(30) 	DEFAULT NULL 	COMMENT '学历名称',
  `EngName` 		VARCHAR(40) 	DEFAULT NULL 	COMMENT '英文名称',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `hum_schooling`(`SchoolingID`,`SchoolingName`,`EngName`,`Memo`,`MergeOutState`) 
VALUES ('01','高中/中专','','',0),('02','大专','','',0),('03','本科','','',0),('04','硕士','','',0),('05','博士','','',0);
#第一步：人员资料（3） - 3.人员主文件设定	# DROP TABLE `staff`;
CREATE TABLE `staff` (
  `staff_id`		INT 		NOT NULL AUTO_INCREMENT COMMENT '员工编号' PRIMARY KEY,
  `job_number` 		VARCHAR(50)	NOT NULL 	COMMENT '工号（用于登录..）',
  `staff_name` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '员工名称',
  `staff_english_name` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '英文名称',
  `team_id`		VARCHAR(50) 	DEFAULT NULL 	COMMENT '所属部门（部门id）',
  `staff_gender` 	TINYINT(1) 	DEFAULT NULL 	COMMENT '性别(1:男,2:女)',
  `staff_idnumber` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '身份证号',
  `password` 		VARCHAR(150)	NOT NULL 	COMMENT '登录密码',
  `staff_birthday` 	DATE 		DEFAULT NULL 	COMMENT '出生日期',
  `staff_maritalstatus` INT(11) 	DEFAULT NULL 	COMMENT '婚姻状况(0 未婚|1 已婚|2离婚|3 丧偶)',
  `staff_native_place` 	INT(11) 	DEFAULT NULL 	COMMENT '血型（0 a型|1 b型|2 ab型|3 o型|5 rh+型|6 rh-型）',
  `staff_nativeplace` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '籍贯',
  `staff_nationality` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '国籍',
  `staff_nation` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '民族',
  `staff_chineseposition` VARCHAR(50) 	DEFAULT NULL 	COMMENT '中文职务',
  `staff_zipcode` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系邮编',
  `staff_Mobilephone` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系电话',
  `staff_politicalstatus` VARCHAR(50) 	DEFAULT NULL 	COMMENT '政治面貌',
  `staff_entrydate` 	DATE 		DEFAULT NULL 	COMMENT '入职日期',
  `staff_becomea_regularworker` DATE 	DEFAULT NULL 	COMMENT '转正日期',
  `staff_probationperiod` VARCHAR(50) 	DEFAULT NULL 	COMMENT '试用期长',
  `staff_dimissiondate` DATE 		DEFAULT NULL 	COMMENT '离职日期',
  `staff_technicaltitle` VARCHAR(50) 	DEFAULT NULL 	COMMENT '技术职称',
  `staff_englishposition` VARCHAR(50) 	DEFAULT NULL 	COMMENT '英文职务',
  `staff_address` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系地址',
  `staff_phone` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '移动电话',
  `staff_highesteducation` VARCHAR(50) 	DEFAULT NULL 	COMMENT '最高学历',
  `staff_degree` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '学位',
  `staff_graduateschool` VARCHAR(50) 	DEFAULT NULL 	COMMENT '毕业学校',
  `staff_major` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '所学专业',
  `staff_foreignlanguagelevel` VARCHAR(50) DEFAULT NULL COMMENT '外语水平',
  `staff_physical_examinationdate` DATE DEFAULT NULL 	COMMENT '体检日期',
  `staff_atmaturitydate` DATE 		DEFAULT NULL 	COMMENT '到期日期',
  `staff_entercountry` 	DATE 		DEFAULT NULL 	COMMENT '入境日期',
  `staff_passport_number` VARCHAR(50) 	DEFAULT NULL 	COMMENT '护照号码',
  `staff_contractstartdate` DATE 	DEFAULT NULL 	COMMENT '合同起始日期',
  `staff_contractenddate` DATE 		DEFAULT NULL 	COMMENT '合同终止日期',
  `staff_contractduration` VARCHAR(50) 	DEFAULT NULL 	COMMENT '合同期长',
  `staff_email` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '电子邮件',
  `staff_censusregisternumber` VARCHAR(50) DEFAULT NULL COMMENT '户籍号码',
  `staff_censusregistezipcode` VARCHAR(50) DEFAULT NULL COMMENT '户籍邮编',
  `staff_censusregisteraddress` VARCHAR(50) DEFAULT NULL COMMENT '户籍地址',
  `staff_hometelephone` VARCHAR(50) 	DEFAULT NULL 	COMMENT '家庭电话',
  `staff_homezipcode` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '家庭邮编',
  `staff_homeaddress` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '家庭地址',
  `staff_newphone` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '现电话',
  `staff_newzipcode` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '现邮编',
  `staff_newaddress` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '现住址',
  `staff_emergencycontact` VARCHAR(50) DEFAULT NULL 	COMMENT '紧急联系人',
  `staff_urgentcontactzipcode` VARCHAR(50) DEFAULT NULL COMMENT '紧急联系邮编',
  `staff_emergencycontactnumber` VARCHAR(50) DEFAULT NULL COMMENT '紧急联系电话',
  `staff_emergencycontactaddress` VARCHAR(50) DEFAULT NULL COMMENT '紧急联系地址',
  `staff_remark` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '备注',
  `staff_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `staff_yn` 		VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `salt` 		VARCHAR(150) 	DEFAULT NULL 	COMMENT '解密密码',
  `staff_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏',
  `staff_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏',
  `staff_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏'
) ENGINE=INNODB DEFAULT CHARSET=utf8;#	,  员工名称  ,     身份证号   ,   密码   ,性别(1:男,2:女),    出生日期   ,     入职日期    , 大概：解密密码)
INSERT INTO `staff`(`job_number`,`team_id`,`staff_name`,`staff_idnumber`,`password`,`staff_gender`,`staff_birthday`,`staff_entrydate`,`salt`)
VALUES 
('10001','09','王总',  '43000019711203001x','5e95aa59025a27b11d85021bc371114b',1,'1971-12-03','2001-04-05','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),
('10002','09','林副总','430000197401090021','5e95aa59025a27b11d85021bc371114b',0,'1974-01-09','2001-04-05','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),
('10003','01','曾会计','430000197410010001','5e95aa59025a27b11d85021bc371114b',0,'1974-10-01','2001-04-05','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),	#财务
('10004','01','陈出纳','430000198010230001','5e95aa59025a27b11d85021bc371114b',0,'1980-10-23','2001-05-08','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),
('10005','02','王经理','430000197612080019','5e95aa59025a27b11d85021bc371114b',1,'1976-12-08','2003-12-05','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),	#销售
('10006','02','刘直销','43000019811124002x','5e95aa59025a27b11d85021bc371114b',0,'1981-11-12','2006-08-12','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),
('10007','02','周直销','430000197905080013','5e95aa59025a27b11d85021bc371114b',1,'1979-05-08','2005-03-05','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),
('10008','05','戴经理','430000197502160015','5e95aa59025a27b11d85021bc371114b',1,'1975-02-16','2008-04-21','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),	#采购
('10009','05','朱采购','43000019720516001x','5e95aa59025a27b11d85021bc371114b',1,'1972-05-16','2004-12-01','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),
('10010','05','邓采购','43000019770924001x','5e95aa59025a27b11d85021bc371114b',1,'1977-09-24','2007-03-05','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),
('10011','08','欧经理','430000197108190010','5e95aa59025a27b11d85021bc371114b',1,'1971-08-19','2001-06-01','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),	#储运
('10012','08','王保管','430000197112030020','5e95aa59025a27b11d85021bc371114b',0,'1971-12-03','2001-12-01','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9'),
('10013','08','胡保管','430000198012040045','5e95aa59025a27b11d85021bc371114b',0,'1980-12-04','2005-01-02','db788fe7-59b5-4fdb-a04f-5cc0301a5dc9');
#第二步：会计科目（4） - 1.币别设定	# DROP TABLE `comcurren_cysys`;
CREATE TABLE `comcurren_cysys` (									#数据表37 C14 有数据8
  `CurrencyID` 		VARCHAR(3) 	DEFAULT NULL 	COMMENT '币别编号',
  `CurrencyName` 	VARCHAR(12) 	DEFAULT NULL 	COMMENT '币别名称',
  `ShortName` 		VARCHAR(8) 	DEFAULT NULL 	COMMENT '币别简称',
  `EngName` 		VARCHAR(12) 	DEFAULT NULL 	COMMENT '英文名称',
  `ModifyDate` 		INT(11) 	DEFAULT NULL 	COMMENT '异动日期',
  `FixedRate` 		DOUBLE 		DEFAULT NULL 	COMMENT '固定汇率',
  `BuyInRate` 		DOUBLE 		DEFAULT NULL 	COMMENT '买进汇率',
  `SellOutRate` 	DOUBLE 		DEFAULT NULL 	COMMENT '卖出汇率',
  `AmountDeciDigits` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '金额位数',
  `AmountThouPt` 	TINYINT(1) 	DEFAULT NULL 	COMMENT '金额位数-千位逗号',
  `PriceDeciDigits` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '单价位数',
  `PriceThouPt` 	TINYINT(1) 	DEFAULT NULL 	COMMENT '单价位数-千位逗号',
  `TaxDigits` 		SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `TaxThouPt` 		TINYINT(1) 	DEFAULT NULL 	COMMENT '',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `CashSubject` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comcurren_cysys`(`CurrencyID`,`CurrencyName`,`ShortName`,`EngName`,`ModifyDate`,`FixedRate`,`BuyInRate`,`SellOutRate`,`AmountDeciDigits`,`AmountThouPt`,`PriceDeciDigits`,`PriceThouPt`,`TaxDigits`,`TaxThouPt`,`MergeOutState`,`CashSubject`) 
VALUES ('EUR','欧元','欧元','EUR',20090421,7.618,7.618,7.618,3,0,3,0,0,0,0,''),
('GBP','英镑','英镑','GBP',20090421,11.935,11.935,11.935,3,0,3,0,0,0,0,''),('HKD','港币','港币','HKD',20090421,1.0506,1.0506,1.0506,0,0,3,0,0,0,0,''),
('JPY','日元','日元','JPY',20090421,0.0649,0.0649,0.0649,0,0,3,0,0,0,0,''),('NTD','台币','台币','NTD',20090421,0.238,0.238,0.238,0,0,3,0,0,0,0,''),
('RMB','人民币','人民币','RMB',20090421,1,1,1,2,1,2,1,0,0,0,''),('USD','美金','美金','USD',20090421,8.195,8.195,8.195,0,0,3,0,0,0,0,'');
#第四步：物料主文件（5） - 1.仓库设定	# DROP TABLE `comware_house`;
CREATE TABLE `comware_house` (
  `WareHouseID` 	VARCHAR(6) 	DEFAULT NULL 	COMMENT '仓库编号',
  `WareHouseName` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '仓库名称',
  `ShortName` 		VARCHAR(8) 	DEFAULT NULL 	COMMENT '仓库简称',
  `EngName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '英文名称',
  `LinkMan` 		VARCHAR(12) 	DEFAULT NULL 	COMMENT '联系人员',
  `Telephone` 		VARCHAR(16) 	DEFAULT NULL 	COMMENT '联系电话',
  `WareHouseAddress` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '仓库地址',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `DataVer` 		INT(11) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comware_house`(`WareHouseID`,`WareHouseName`,`ShortName`,`EngName`,`LinkMan`,`Telephone`,`WareHouseAddress`,`Memo`,`MergeOutState`,`DataVer`) 
VALUES ('01','原料仓库','原料仓库','','王保管','','','',0,3),('02','成品仓','成品仓','','胡保管','','','',0,4);
#第四步：物料主文件（5） - 2.计量单位设定	# DROP TABLE `comstd_unit`;
CREATE TABLE `comstd_unit` (
  `UnitID` 		VARCHAR(6) 	DEFAULT NULL 	COMMENT '单位编号',
  `UnitName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '单位名称',
  `EngName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '英文名称',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comstd_unit`(`UnitID`,`UnitName`,`EngName`,`Memo`,`MergeOutState`) 
VALUES ('01','PCS','','',0),('02','KG','','',0);
#第四步：物料主文件（5） - 4.物料类别设定	# DROP TABLE `comproduct_class`;
CREATE TABLE `comproduct_class` (
  `ClassID` 		VARCHAR(6) 	DEFAULT NULL 	COMMENT '类别编号',
  `ClassName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '类别名称',
  `EngName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '英文名称',
  `AccInventory` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '存货科目',
  `AccPurchased` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '',
  `ReturnPurchase` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '',
  `AccSale` 		VARCHAR(16) 	DEFAULT NULL 	COMMENT '销售收入科目',
  `AccSaleCost` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '销售成本科目',
  `ReturnSale` 		VARCHAR(16) 	DEFAULT NULL 	COMMENT '',
  `GiftExpense` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '赠品费用科目',
  `MaterialWarehouse` 	VARCHAR(8) 	DEFAULT NULL 	COMMENT '',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `DataVer` 		INT(11) 	DEFAULT NULL 	COMMENT '',
  `OtherExpense` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '其他费用科目',
  `OtherIncome` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '其他收入科目',
  `OtherCost` 		VARCHAR(16) 	DEFAULT NULL 	COMMENT '其他成本科目',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `SendOutWare` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '发出商品科目'
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comproduct_class`(`ClassID`,`ClassName`,`EngName`,`AccInventory`,`AccPurchased`,`ReturnPurchase`,`AccSale`,`AccSaleCost`,`ReturnSale`,`GiftExpense`,`MaterialWarehouse`,`MergeOutState`,`DataVer`,`OtherExpense`,`OtherIncome`,`OtherCost`,`Memo`,`SendOutWare`) 
VALUES ('B01','主机包装物','','包装物','','','其他业务收入','其他业务支出','','营业费用','',0,2,'','','','','发出商品'),
('B02','彩显包装物','','包装物','','','其他业务收入','其他业务支出','','营业费用','',0,2,'','','','','发出商品'),
('B98','运输包装物','','包装物','','','其他业务收入','其他业务支出','','营业费用','',0,4,'','','','','发出商品'),
('B99','其它包装物','','包装物','','','其他业务收入','其他业务支出','','营业费用','',0,2,'','','','','发出商品'),
('C01','主机','','库存商品','','','主营业务收入','主营业务成本','','营业费用','',0,3,'','','','','发出商品'),
('C02','显示器','','库存商品','','','主营业务收入','主营业务成本','','营业费用','',0,3,'','','','','发出商品'),
('C03','打印机','','库存商品','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('C04','扫描仪','','库存商品','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('C99','其它商品','','库存商品','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('X01','塑料耗材','','低值易耗品','','','其他业务收入','其他业务支出','','','',0,2,'','','','',''),
('X02','通用小配件','','低值易耗品','','','其他业务收入','其他业务支出','','','',0,2,'','','','',''),
('X03','油性耗材','','低值易耗品','','','其他业务收入','其他业务支出','','','',0,2,'','','','',''),
('X04','清洁类耗材','','低值易耗品','','','其他业务收入','其他业务支出','','','',0,2,'','','','',''),
('Y01','CPU','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y02','内存','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y03','主板','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y04','显卡','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y05','网卡','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y06','硬盘','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y07','光驱','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y08','机箱','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y09','电源','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y10','键盘','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y11','鼠标','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y12','手写板','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y98','数据线','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品'),
('Y99','其它原材料','','包装物','','','主营业务收入','主营业务成本','','营业费用','',0,2,'','','','','发出商品');
#第四步：物料主文件（5） - 5.物料主文件设定	# DROP TABLE `matter`;
CREATE TABLE `matter` (
  `matter_id` 		VARCHAR(50) 	NOT NULL 	COMMENT '物料编号（主键 唯一）',
  `matter_name` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '物料名称',
  `matter_size` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '规格型号',
  `matter_english_name` VARCHAR(32) 	DEFAULT NULL 	COMMENT '英文名称',
  `mt_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '物料类型id，关联material_type物料类型表',
  `mu_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '计量单位id，关联munit 计量单位表',
  `matter_barno` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '条形码编号',
  `matter_msale` 	FLOAT 		DEFAULT NULL 	COMMENT '建议售价',
  `matter_msale_a` 	FLOAT 		DEFAULT NULL 	COMMENT '建议售价a',
  `matter_msale_b` 	FLOAT 		DEFAULT NULL 	COMMENT '建议售价b',
  `matter_msale_c` 	FLOAT 		DEFAULT NULL 	COMMENT '建议售价c',
  `matter_msale_d` 	FLOAT 		DEFAULT NULL 	COMMENT '建议售价d',
  `matter_msale_e` 	FLOAT 		DEFAULT NULL 	COMMENT '建议售价e',
  `matter_standard_price` FLOAT 	DEFAULT NULL 	COMMENT '标准进价',
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '币别id，关联currency币别表',

  `matter_iftax` 	INT(11) 	DEFAULT NULL 	COMMENT '0,1（状态）表示是否含税',
  `matter_taxno` 	FLOAT 		DEFAULT NULL 	COMMENT '税目',
  `matter_taxpoint` 	FLOAT 		DEFAULT NULL 	COMMENT '税率',
  
  
  
  `matter_safestock` 	INT(11) 	DEFAULT NULL 	COMMENT '安全存量',
  `matter_daystartcount` INT(11) 	DEFAULT NULL 	COMMENT '期初总数',
  `matter_avgcost` 	FLOAT 		DEFAULT NULL 	COMMENT '平均成本',
  `matter_standardcost` FLOAT 		DEFAULT NULL 	COMMENT '标准成本',
  `matter_daystartallcost` FLOAT 	DEFAULT NULL 	COMMENT '期初总成本',
  `matter_lowsafestock` INT(11) 	DEFAULT NULL 	COMMENT '低于安全存量',
  `matter_nowcount` 	INT(11) 	DEFAULT NULL 	COMMENT '现行总数',
  `matter_nowavgcost` 	FLOAT 		DEFAULT NULL 	COMMENT '现行平均成本',
  `matter_standardallcost` FLOAT 	DEFAULT NULL 	COMMENT '标准总成本',
  `matter_nowallcost` 	FLOAT 		DEFAULT NULL 	COMMENT '现行总成本',
  
  `matter_firstin` 	DATE 		DEFAULT NULL 	COMMENT '最初出库日',
  `matter_firstout` 	DATE 		DEFAULT NULL 	COMMENT '最初入库日',
  `matter_appearstartday` INT(11) 	DEFAULT NULL 	COMMENT '呆滞起记天数',
  `matter_recentout` 	DATE 		DEFAULT NULL 	COMMENT '最近出库日',
  `matter_recentin` 	DATE 		DEFAULT NULL 	COMMENT '最近入库',
  `matter_stopdate` 	DATE 		DEFAULT NULL 	COMMENT '停用日期',
  `matter_mdecoration` 	VARCHAR(100) 	DEFAULT NULL 	COMMENT '物料说明',
  
  `matter_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `matter_yn` 		VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `matter_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `matter_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `matter_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  `matter_custom4` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏四',
  `matter_custom5` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏五',
  `matter_custom6` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏六',
  PRIMARY KEY (`matter_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#第五步：客户资料（6） - 1.地区设定/第六步：供应商资料（3） - 1.地区设定		（“客户”和“供应商”都是这一张表）# DROP TABLE `comarea`;
CREATE TABLE `comarea` (
  `AreaID` 		VARCHAR(6) 	DEFAULT NULL 	COMMENT '地区编号',
  `AreaName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '地区名称',
  `EngName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '英文名称',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comarea`(`AreaID`,`AreaName`,`EngName`,`Memo`,`MergeOutState`) 
VALUES ('C01','东北区','','',0),('C02','华北区','','',0),('C03','西北区','','',0),
('C04','华东区','','',0),('C05','华中区','','',0),('C06','华南区','','',0),('C07','西南区','','',0);
#第五步：客户资料（6） - 2.客户类别设定/第六步：供应商资料（3） - 2.供应商类别设定	（“客户”和“供应商”两类别表合一）# DROP TABLE `comcust_class`;
CREATE TABLE `comcust_class` (
  `Flag` 		SMALLINT(6) 	DEFAULT NULL 	COMMENT '标识（1.客户/2.供应商）',
  `ClassID` 		VARCHAR(6) 	DEFAULT NULL 	COMMENT '类别编号',
  `ClassName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '类别名称',
  `EngName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '英文名称',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comcust_class`(`Flag`,`ClassID`,`ClassName`,`EngName`,`Memo`,`MergeOutState`) 
VALUES (1,'01','大客户','','',0),(1,'02','代理商','','',0),(1,'03','其它经销商','','',0),(1,'99','其它最终用户','','',0),
(2,'01','主要供应商','','',0),(2,'02','一般供应商','','',0),(2,'03','委外厂','','',0),(2,'04','其它供应商','','',0);
#第五步：客户资料（6） - 3.客户等级设定		# DROP TABLE `comcustomerlevel`;
CREATE TABLE `comcustomerlevel` (
  `LevelID` 		VARCHAR(6) 	DEFAULT NULL 	COMMENT '编号',
  `LevelName` 		VARCHAR(30) 	DEFAULT NULL 	COMMENT '等级',
  `Memo` 		VARCHAR(400) 	DEFAULT NULL 	COMMENT '备注',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comcustomerlevel`(`LevelID`,`LevelName`,`Memo`,`MergeOutState`) 
VALUES ('A','A级客户','',0),('B','B级客户','',0),('C','C级客户','',0),('D','D级客户','',0),('E','E级客户','',0);
#第五步：客户资料（6） - 5.客户主文件设定	# DROP TABLE `customer`;
CREATE TABLE `customer` (
  `customer_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '客户编号（主键 唯一）',
  `customer_name` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '客户全称',
  `customer_easyname` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '客户简称',
  `customer_english_name` VARCHAR(50) 	DEFAULT NULL 	COMMENT '英文全称',
  `customer_charge_person` VARCHAR(50) 	DEFAULT NULL 	COMMENT '英文简称',
  `customer_account_ownership` VARCHAR(50) DEFAULT NULL COMMENT '账款归属',
  `customer_type` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '类别',
  `customer_zone` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '地区(地区表)',
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '币别id',
  `customer_principalman` VARCHAR(50) 	DEFAULT NULL 	COMMENT '负责人',
  `customer_linkman` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系人',
  `customer_linktela` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系电话一',
  `customer_linktelb` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系电话二',
  `customer_linktelc` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系电话三',
  `customer_mobilephone` VARCHAR(50) 	DEFAULT NULL 	COMMENT '移动电话',
  `ada_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '银行账号',
  `bank_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '开户银行id(关联cus_bank开户银行表)',
  
  `customer_taxcheckno` VARCHAR(50) 	DEFAULT NULL 	COMMENT '税务登记号',
  `customer_capitalmoney` FLOAT 	DEFAULT NULL 	COMMENT '资本额',
  `customer_job` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '行业别',
  `customer_email` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '电子邮件',
  `customer_webadd` 	VARCHAR(100) 	DEFAULT NULL 	COMMENT '网址',
  `customer_faxno` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '传真号码',
  `customer_cufirstsaleout` DATE 	DEFAULT NULL 	COMMENT '最初销售出库日',
  `customer_cufirstsalereturn` DATE 	DEFAULT NULL 	COMMENT '最初销售退货日',
  `customer_curecentsaleout` DATE 	DEFAULT NULL 	COMMENT '最近销售出库日',
  `customer_curecentsalereturn` DATE 	DEFAULT NULL 	COMMENT '最近销售退货日',
  `customer_curecentvisit` DATE 	DEFAULT NULL 	COMMENT '最近拜访日',
  `customer_cuordervisit` DATE 		DEFAULT NULL 	COMMENT '预约拜访日',
  `customer_discountpoint` FLOAT 	DEFAULT NULL 	COMMENT '折数',
  `customer_salelv` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '售价等级',
  `customer_cuiftax` 	INT(11) 	DEFAULT NULL 	COMMENT '是否含税（0，1）',
  `customer_latentcusno` VARCHAR(50) 	DEFAULT NULL 	COMMENT '潜在客户编号',
  `customer_tanddate` 	DATE 		DEFAULT NULL 	COMMENT '客户建立日期',
  `endbusinessday` 	DATE 		DEFAULT NULL 	COMMENT '终止交易日',
  `customer_creditmoney` FLOAT 		DEFAULT NULL 	COMMENT '账款额度',
  `customer_residuemonet` FLOAT 	DEFAULT NULL 	COMMENT '剩余额度',
  `Receivable_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '收款条件id(关联应收冲款单表)',
  `customer_cuendorderday` DATE 	DEFAULT NULL 	COMMENT '每月结账日',
  `customer_honestlv` 	VARCHAR(5) 	DEFAULT NULL 	COMMENT '信用等级',
  `it_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '发票类型id(关联发票类型表)',
  `It_Accounts_eceivable_subject` VARCHAR(50) DEFAULT NULL COMMENT '应收账款科目(关联会计科目表account_id)',
  `customer_cufirstcollect` FLOAT 	DEFAULT NULL 	COMMENT '期初预收款',
  `customer_houldcollect` FLOAT 	DEFAULT NULL 	COMMENT '期初应收款',
  `customer_cuendcollect` FLOAT 	DEFAULT NULL 	COMMENT '期末预收款',
  `cuendshouldcollect` FLOAT 		DEFAULT NULL 	COMMENT '期末应收款',
  
  `It_deposit_received_subject` VARCHAR(50) DEFAULT NULL COMMENT '预收账款科目id(关联会计科目表account_id)',
  `customer_cudecoration` VARCHAR(50) 	DEFAULT NULL 	COMMENT '其他备注',
  `customer_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `customer_yn` 	VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `customer_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `customer_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `customer_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  `customer_custom4` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏四',
  `customer_custom5` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏五',
  `customer_custom6` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏六',
  PRIMARY KEY (`customer_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#第六步：供应商资料（3） - 3.供应商主文件设定
CREATE TABLE `supplier` (
  `supplier_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '供应商编号（主键 唯一）',
  `supplier_name` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '供应商全称',
  `supplier_easyname` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '供应商简称',
  `supplier_engname` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '英文名称',
  `supplier_easyengname` VARCHAR(50) 	DEFAULT NULL 	COMMENT '英文简称',
  `supplier_account_attribution` VARCHAR(50) DEFAULT NULL COMMENT '账款归属',
  `supplier_type` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '类别',
  `supplier_zone` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '地区',
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '币别id',
  `supplier_principalman` VARCHAR(50) 	DEFAULT NULL 	COMMENT '负责人',
  `supplier_linkman` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系人',
  `supplier_linktela` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系电话一',
  `supplier_linktelb` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系电话二',
  `supplier_linktelc` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '联系电话三',
  `supplier_mobilephone` VARCHAR(50) 	DEFAULT NULL 	COMMENT '移动电话',
  `ada_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '银行账号',
  `bank_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '开户银行id',
  `supplier_procurement _staff` VARCHAR(50) DEFAULT NULL COMMENT '采购人员',
  `supplier_taxcheckno` VARCHAR(50) 	DEFAULT NULL 	COMMENT '税务登记号',
  `supplier_capitalmoney` FLOAT 	DEFAULT NULL 	COMMENT '资本额',
  `supplier_job` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '行业别',
  `supplier_email` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '电子邮件',
  `supplier_webadd` 	VARCHAR(100) 	DEFAULT NULL 	COMMENT '网址',
  `supplier_faxno` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '传真号码',
  `supplier_cufirstsaleinput` DATE 	DEFAULT NULL 	COMMENT '最初销售入库日',
  `supplier_cufirstsalereturn` DATE 	DEFAULT NULL 	COMMENT '最初销售退货日',
  `supplier_curecentsaleinput` DATE 	DEFAULT NULL 	COMMENT '最近销售入库日',
  `supplier_curecentsalereturn` DATE 	DEFAULT NULL 	COMMENT '最近销售退货日',
  `supplier_tax_included` VARCHAR(50) 	DEFAULT NULL 	COMMENT '单价是否含税',
  `supplier_terminationdate` DATE 	DEFAULT NULL 	COMMENT '终止交易日',
  `supplier_creditmoney` FLOAT 		DEFAULT NULL 	COMMENT '账款额度',
  `supplier_residuemonet` FLOAT 	DEFAULT NULL 	COMMENT '剩余额度',
  `supplier_condition` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '付款条件',
  `supplier_cuendorderday` DATE 	DEFAULT NULL 	COMMENT '每月结账日',
  `supplier_honestlv` 	VARCHAR(5) 	DEFAULT NULL 	COMMENT '信用等级',
  `supplier_invoice_type` VARCHAR(50) 	DEFAULT NULL 	COMMENT '发票类型',
  `supplier_cufirstcollect` FLOAT 	DEFAULT NULL 	COMMENT '期初预收款',
  `supplier_houldcollect` FLOAT 	DEFAULT NULL 	COMMENT '期初应收款',
  `supplier_cuendcollect` FLOAT 	DEFAULT NULL 	COMMENT '期末预收款',
  `supplier_cuendshouldcollect` FLOAT 	DEFAULT NULL 	COMMENT '期末应收款',
  `supplier_cudecoration` VARCHAR(50) 	DEFAULT NULL 	COMMENT '未开票金额',
  `supplier_collectiontermid` INT(11) 	DEFAULT NULL 	COMMENT '预付账款科目',
  `supplier_invoicetypeid` INT(11) 	DEFAULT NULL 	COMMENT '应付账款科目',
  `supplier_houldcollectmoney` INT(11) 	DEFAULT NULL 	COMMENT '应付账款科目',
  `supplier_curecollectmoney` INT(11) 	DEFAULT NULL 	COMMENT '应付暂估科目',
  `supplier_address_no` VARCHAR(50) 	DEFAULT NULL 	COMMENT '地址编号',
  `supplier_remark` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '备注',
  `supplier_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `supplier_yn` 	VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `supplier_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `supplier_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `supplier_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  `supplier_custom4` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏四',
  `supplier_custom5` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏五',
  `supplier_custom6` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏六',
  PRIMARY KEY (`supplier_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#第七步：银行资料（2） - 1.银行类别设定
CREATE TABLE `combank_cls` (
  `BankClsID` 		VARCHAR(6) 	DEFAULT NULL 	COMMENT '类别编号',
  `BankClsName` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '类别名称',
  `EngName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '英文名称',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `combank_cls`(`BankClsID`,`BankClsName`,`EngName`,`Memo`,`MergeOutState`) VALUES ('01','开户行','','',0);
#第八步：其他资料（4） - 1.收入费用类别设定
CREATE TABLE `comfaremeans` (
  `FareClassID` 	VARCHAR(6) 	DEFAULT NULL 	COMMENT '编号',
  `FareClassName` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '名称',
  `EngName` 		VARCHAR(100) 	DEFAULT NULL 	COMMENT '英文名称',
  `AccSubjectID` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '会计科目',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `Flag` 		SMALLINT(6) 	DEFAULT NULL 	COMMENT '标识',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `InvoProdName` 	VARCHAR(60) 	DEFAULT NULL 	COMMENT ''
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comfaremeans`(`FareClassID`,`FareClassName`,`EngName`,`AccSubjectID`,`Memo`,`Flag`,`MergeOutState`,`InvoProdName`) 
VALUES ('01','主营业务收入','','','',1,0,''),('02','其它业务收入','','','',1,0,''),('03','营业外收入','','','',1,0,''),('04','陆运费','','','',1,0,''),('05','空运费','','','',1,0,'');
#第八步：其他资料（4） - 2.结算方式设定
CREATE TABLE `comfundstyle` (
  `ClassID` 		VARCHAR(6) 	DEFAULT NULL 	COMMENT '编号',
  `ClassName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '名称',
  `AccBankID` 		VARCHAR(7) 	DEFAULT NULL 	COMMENT '',
  `EngClassName` 	VARCHAR(60) 	DEFAULT NULL 	COMMENT '英文名称',
  `PosAcc` 		VARCHAR(16) 	DEFAULT NULL 	COMMENT '',
  `NegAcc` 		VARCHAR(16) 	DEFAULT NULL 	COMMENT '',
  `IsCash` 		INT(11) 	DEFAULT NULL 	COMMENT '',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `DataVer` 		INT(11) 	DEFAULT NULL 	COMMENT '',
  `Memo` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `AccSubjectID` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '会计科目'
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `comfundstyle`(`ClassID`,`ClassName`,`AccBankID`,`EngClassName`,`PosAcc`,`NegAcc`,`IsCash`,`MergeOutState`,`DataVer`,`Memo`,`AccSubjectID`) 
VALUES ('01','转账','','','','',0,0,1,'',''),('02','汇票','','','','',0,0,1,'',''),('03','现金','','','','',0,0,1,'','');

##2.采购管理开账（共三步）			4.库存管理开账（共两步）
#第二步：类型设定（3） - 1.采购请购类型设定	第二步：类型设定（2） - 1.入库类型设定		第二步：类型设定（2） - 2.出库类型设定		（三表合一）
CREATE TABLE `ordbillstyle` (
  `Flag` 		SMALLINT(6) 	DEFAULT NULL 	COMMENT '标识（3.采购请购/6.入库类型/7.出库类型）',
  `ClassID` 		VARCHAR(6) 	DEFAULT NULL 	COMMENT '类型编号',
  `ClassName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '类型名称',
  `EngName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '英文名称',
  `Memo` 		VARCHAR(400) 	DEFAULT NULL 	COMMENT '备注',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `AccSubjectID` 	VARCHAR(16) 	DEFAULT NULL 	COMMENT '货方科目'
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `ordbillstyle`(`Flag`,`ClassID`,`ClassName`,`EngName`,`Memo`,`MergeOutState`,`AccSubjectID`) 
VALUES (3,'01','原料普通请购','','',0,''),(3,'02','原料加急请购','','',0,''),(3,'03','商品请购','','',0,''),(3,'04','商品加急请购','','',0,''),(3,'99','用品请购','','',0,''),
(6,'01','拆解入库','','',0,''),(6,'02','借入','','',0,''),(6,'03','借出归还','','',0,''),(6,'04','生产消耗件退料','','',0,''),(6,'09','其它入库','','',0,''),
(7,'01','组合出库','','',0,''),(7,'02','归还出库','','',0,''),(7,'03','借出','','',0,''),(7,'04','生产消耗件领料','','',0,''),(7,'09','其它出库','','',0,'');

##9.固资管理开账（共两步）
#第二步：基本资料（6） - 1.使用状态设定
CREATE TABLE `assusestate` (										#数据表18 A18 有数据7
  `StateID` 		VARCHAR(6) 	DEFAULT NULL 	COMMENT '状态编号',
  `StateName` 		VARCHAR(30) 	DEFAULT NULL 	COMMENT '状态名称',
  `IsDepr` 		TINYINT(1) 	DEFAULT NULL 	COMMENT '是否折扣编号（1.计提折扣/2.不提折扣）',
  `Remark` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注'
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `assusestate`(`StateID`,`StateName`,`IsDepr`,`Remark`) 
VALUES ('01','使用中',1,''),('02','季节性停用',1,''),('03','大修理停用',1,''),('04','未使用',1,''),('05','闲置',1,'');
#第二步：基本资料（6） - 2.资产来源设定+3.资产处置方式设定（各6条数据，共12条）
CREATE TABLE `asssource` (										#数据表17 A17 有数据6
  `SourceID` 		VARCHAR(3) 	DEFAULT NULL 	COMMENT '编号',
  `SourceName` 		VARCHAR(20) 	DEFAULT NULL 	COMMENT '名称',
  `Remark` 		VARCHAR(4000) 	DEFAULT NULL 	COMMENT '备注',
  `MergeOutState` 	SMALLINT(6) 	DEFAULT NULL 	COMMENT '',
  `ChangeType` 		TINYINT(1) 	DEFAULT NULL 	COMMENT '类别（来源/处置）',
  `Flag` 		INT(11) 	DEFAULT NULL 	COMMENT '标识'
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT  INTO `asssource`(`SourceID`,`SourceName`,`Remark`,`MergeOutState`,`ChangeType`,`Flag`) 
VALUES ('101','购入','',0,1,1),('102','在建工程转入','',0,1,1),('103','接受投资','',0,1,1),('104','接受捐赠','',0,1,1),('105','融资租入','',0,1,1),('106','盘盈','',0,1,1),
('201','报废','',0,0,2),('202','出售','',0,0,2),('203','对外投资','',0,0,2),('204','对外捐赠','',0,0,2),('205','融资租出','',0,0,2),('206','盘亏','',0,0,2);





















###第1-3份，销售模块，第1份与第2份两位需合作
###第一份（周鹏）：24
###销售报价单(要做历史交易查询、利润预估)			6
###销售出库单(要做历史交易查询、利润查询、信用额度控制）	10
###销售日报表						2
###销售分析表						2

#销售报价单 主表
CREATE TABLE `sale_quotation` (
  `sq_id` 		VARCHAR(50) 	NOT NULL 	COMMENT '',
  `sq_document_time` 	DATE 		DEFAULT NULL 	COMMENT '',
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  `sq_exchange_rate` 	FLOAT 		DEFAULT NULL 	COMMENT '',
  `sq_effective_time` 	DATE 		DEFAULT NULL 	COMMENT '',
  `sq_tax` 		INT(11) 	DEFAULT NULL 	COMMENT '',
  `customer_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  `sq_delivery_address` VARCHAR(20) 	DEFAULT NULL 	COMMENT '',
  `staff_id` 		INT(11) 	DEFAULT NULL 	COMMENT '',
  `team_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  `sq_monograph` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  `sq_reviewer` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  `sq_watchword` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '',
  `sq_tailclause` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '',
  `sq_remark` 		VARCHAR(200) 	DEFAULT NULL 	COMMENT '',
  `sq_auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  `sq_yn` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  `sq_custom1` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  `sq_custom2` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  `sq_custom3` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '',
  PRIMARY KEY (`sq_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#销售报价单 详表
CREATE TABLE `sale_quotation_details` (
  `Sqd_ProdID` VARCHAR(10) NOT NULL COMMENT '栏号',
  `Sqd_SerNO` VARCHAR(20) DEFAULT NULL COMMENT '物料编号，来源物料主文件',
  `Sqd_ProdName` VARCHAR(30) DEFAULT NULL COMMENT '物料名称，来源物料主文件',
  `Sqd_ProdSize` VARCHAR(30) DEFAULT NULL COMMENT '规格型号，来源物料主文件',
  `Sqd_UnitName` VARCHAR(20) DEFAULT NULL COMMENT '单位名称，来源物料主文件',
  `Sqd_sQuantity` INT(11) DEFAULT '0' COMMENT '数量,要有小兰标签，但如果为0，不可保存',
  `Sqd_ZkqPrice` FLOAT DEFAULT NULL COMMENT '折扣前单价',
  `Sqd_Discount` FLOAT DEFAULT NULL COMMENT '折数',
  `Sqd_UnitPrice` FLOAT DEFAULT NULL COMMENT '单价',
  `Sqd_Price` FLOAT DEFAULT NULL COMMENT '金额',
  `Sqd_TaxRate` FLOAT DEFAULT NULL COMMENT '税率',
  `Sqd_Taxlimit` FLOAT DEFAULT NULL COMMENT '税额',
  `Sqd_TaxInclusivePrice` FLOAT DEFAULT NULL COMMENT '含税金额',
  `Sqd_Complimentart` INT(11) DEFAULT NULL COMMENT '赠品（0，1）',
  `Sqd_ItemRemark` VARCHAR(50) DEFAULT NULL COMMENT '分录备注',
  `sql_id` VARCHAR(50) DEFAULT NULL COMMENT '详表主键 关联主表',
  `Sqd_auditing` VARCHAR(50) DEFAULT NULL,
  `Sqd_yn` VARCHAR(50) DEFAULT '0',
  `Sqd_custom1` VARCHAR(50) DEFAULT NULL,
  `Sqd_custom2` VARCHAR(50) DEFAULT NULL,
  `Sqd_custom3` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`Sqd_ProdID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

#销售出库单 主表
CREATE TABLE `sale_out_warehouse` (
  `sow_id` VARCHAR(50) NOT NULL,
  `customer_id` VARCHAR(50) DEFAULT NULL,
  `sow_address` VARCHAR(32) DEFAULT NULL,
  `sowt_id` VARCHAR(50) DEFAULT NULL,
  `sow_price_include_tax` VARCHAR(50) DEFAULT NULL,
  `warehouse_id` VARCHAR(50) DEFAULT NULL,
  `sow_certificate_number` VARCHAR(50) DEFAULT NULL,
  `sow_document_date` DATE DEFAULT NULL,
  `sow_document_number` VARCHAR(50) DEFAULT NULL,
  `currency_id` VARCHAR(50) DEFAULT NULL,
  `sow_exchange_rate` FLOAT DEFAULT NULL,
  `sow_foreign_trade` VARCHAR(50) DEFAULT NULL,
  `sow_sunnum` INT(11) DEFAULT NULL,
  `sow_sunmoney` FLOAT DEFAULT NULL,
  `sow_tax` FLOAT DEFAULT NULL,
  `sow_including_tax_amount` FLOAT DEFAULT NULL,
  `sow_saleszkgs` VARCHAR(20) DEFAULT NULL,
  `sow_salesdate` DATE DEFAULT NULL,
  `sow_salessktj` VARCHAR(20) DEFAULT NULL,
  `sow_salesday` INT(11) DEFAULT NULL,
  `sow_salesyue` DATE DEFAULT NULL,
  `sow_buyer` VARCHAR(50) DEFAULT NULL,
  `sow_belongs_section` VARCHAR(50) DEFAULT NULL,
  `sow_belongs_project` VARCHAR(50) DEFAULT NULL,
  `sow_form` VARCHAR(50) DEFAULT NULL,
  `sow_checkagain_staff` VARCHAR(50) DEFAULT NULL,
  `sow_project` VARCHAR(50) DEFAULT NULL,
  `sow_header_provision` VARCHAR(50) DEFAULT NULL,
  `sow_end_clause` VARCHAR(50) DEFAULT NULL,
  `sow_remark` VARCHAR(50) DEFAULT NULL,
  `sow_auditing` VARCHAR(50) DEFAULT NULL,
  `sow_yn` VARCHAR(50) DEFAULT '0',
  `sow_custom1` VARCHAR(50) DEFAULT NULL,
  `sow_custom2` VARCHAR(50) DEFAULT NULL,
  `sow_custom3` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`sow_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#销售出库单 详表
CREATE TABLE `sale_out_warehouse_detailed` (
  `sowd_id` VARCHAR(50) NOT NULL,
  `sow_id` VARCHAR(50) DEFAULT NULL,
  `matter_id` VARCHAR(50) DEFAULT NULL,
  `sowd_engname` VARCHAR(32) DEFAULT NULL,
  `sowd_remark` VARCHAR(50) DEFAULT NULL,
  `sowd_price_include_tax` VARCHAR(50) DEFAULT NULL,
  `sowd_single_status` INT(11) DEFAULT NULL,
  `sowd_document_date` DATE DEFAULT NULL,
  `sowd_document_number` FLOAT DEFAULT NULL,
  `sowd_price` FLOAT DEFAULT NULL,
  `sowd_money` FLOAT DEFAULT NULL,
  `sowd_tax_rate` FLOAT DEFAULT NULL,
  `sowd_tax_amount` FLOAT DEFAULT NULL,
  `sowd_including_tax_amount` FLOAT DEFAULT NULL,
  `sowd_batch_number` VARCHAR(50) DEFAULT NULL,
  `sowd_material_combination` VARCHAR(50) DEFAULT NULL,
  `sowd_ifgift` VARCHAR(50) DEFAULT NULL,
  `sowd_invoice_details` VARCHAR(50) DEFAULT NULL,
  `sowd_nomake_invoice_num` INT(11) DEFAULT NULL,
  `sowd_remarks` VARCHAR(300) DEFAULT NULL,
  `sowd_source_order` VARCHAR(50) DEFAULT NULL,
  `sowd_source_no` VARCHAR(50) DEFAULT NULL,
  `sowd_auditing` VARCHAR(50) DEFAULT NULL,
  `sowd_yn` VARCHAR(50) DEFAULT '0',
  `sowd_custom1` VARCHAR(50) DEFAULT NULL,
  `sowd_custom2` VARCHAR(50) DEFAULT NULL,
  `sowd_custom3` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`sowd_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;





###第二份（丁世豪）：24
###销售订单(要做历史交易查询、利润预估、信用额度控制）		7
###销售退货单							10
###销售排行表						2

#销售订单 主表
CREATE TABLE `sale_order` (
  `so_id` VARCHAR(50) NOT NULL,
  `so_document_time` DATE DEFAULT NULL,
  `so_documentnumber` VARCHAR(20) DEFAULT NULL,
  `so_delivery_address` DOUBLE DEFAULT NULL,
  `sot_id` DATE DEFAULT NULL,
  `so_customerorder` INT(50) DEFAULT NULL,
  `so_tax` VARCHAR(50) DEFAULT NULL,
  `currency_id` VARCHAR(20) DEFAULT NULL,
  `so_oder_static` VARCHAR(50) DEFAULT NULL,
  `staff_id` VARCHAR(50) DEFAULT NULL,
  `team_id` VARCHAR(50) DEFAULT NULL,
  `so_monograph` VARCHAR(50) DEFAULT NULL,
  `so_reviewer` VARCHAR(50) DEFAULT NULL,
  `so_ subordinate` VARCHAR(50) DEFAULT NULL,
  `so_ watchword` VARCHAR(20) DEFAULT NULL,
  `so_ tailclause` VARCHAR(20) DEFAULT NULL,
  `so_ remark` VARCHAR(200) DEFAULT NULL,
  `so_ account_ownership` VARCHAR(50) DEFAULT NULL,
  `so_collection_time` VARCHAR(50) DEFAULT NULL,
  `so_collection_month` VARCHAR(50) DEFAULT NULL,
  `so_collection_terms` VARCHAR(50) DEFAULT NULL,
  `so_collection_terms_day` VARCHAR(50) DEFAULT NULL,
  `so_auditing` VARCHAR(50) DEFAULT NULL,
  `so_yn` VARCHAR(50) DEFAULT '0',
  `so_custom1` VARCHAR(50) DEFAULT NULL,
  `so_custom2` VARCHAR(50) DEFAULT NULL,
  `so_custom3` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`so_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#销售订单 详表
CREATE TABLE `sale_order_detail` (
  `sol_id` VARCHAR(50) NOT NULL,
  `so_id` VARCHAR(50) DEFAULT NULL,
  `matter_id` VARCHAR(50) DEFAULT NULL,
  `sol_mat_name` VARCHAR(50) DEFAULT NULL,
  `sol_mat_type` VARCHAR(20) DEFAULT NULL,
  `sol_nominal` VARCHAR(20) DEFAULT NULL,
  `sol_quantity` INT(11) DEFAULT NULL,
  `sol_pre_price` FLOAT DEFAULT NULL,
  `sol_fold` INT(11) DEFAULT NULL,
  `sol_price` FLOAT DEFAULT NULL,
  `sol_amount` FLOAT DEFAULT NULL,
  `sol_tax_rate` FLOAT DEFAULT NULL,
  `sol_tax` FLOAT DEFAULT NULL,
  `sol_tax_amount` FLOAT DEFAULT NULL,
  `sol_giveaway` INT(11) DEFAULT NULL,
  `sol_journalizing` VARCHAR(50) DEFAULT NULL,
  `sol_material_composition` INT(11) DEFAULT NULL,
  `sol_single_source` VARCHAR(50) DEFAULT NULL,
  `sol_single_oder` VARCHAR(50) DEFAULT NULL,
  `sol_production` INT(11) DEFAULT NULL,
  `sol_scheduling_single_number` VARCHAR(50) DEFAULT NULL,
  `sol_produced_quantity` INT(11) DEFAULT NULL,
  `sol_auditing` VARCHAR(50) DEFAULT NULL,
  `sol_yn` VARCHAR(50) DEFAULT '0',
  `sol_custom1` VARCHAR(50) DEFAULT NULL,
  `sol_custom2` VARCHAR(50) DEFAULT NULL,
  `sol_custom3` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`sol_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#销售退货单 主表
CREATE TABLE `sale_return_warehouse` (
  `srw_id` VARCHAR(50) NOT NULL,
  `customer_id` VARCHAR(50) DEFAULT NULL,
  `srw_address` VARCHAR(32) DEFAULT NULL,
  `srwt_id` VARCHAR(50) DEFAULT NULL,
  `srw_price_include_tax` VARCHAR(50) DEFAULT NULL,
  `salescxrk` INT(11) DEFAULT NULL,
  `warehouse_id` VARCHAR(50) DEFAULT NULL,
  `srw_certificate_number` VARCHAR(50) DEFAULT NULL,
  `srw_document_date` DATE DEFAULT NULL,
  `srw_document_number` VARCHAR(50) DEFAULT NULL,
  `currency_id` VARCHAR(50) DEFAULT NULL,
  `srw_exchange_rate` FLOAT DEFAULT NULL,
  `srw_foreign_trade` INT(11) DEFAULT NULL,
  `srw_sunnum` FLOAT DEFAULT NULL,
  `srw_sunmoney` FLOAT DEFAULT NULL,
  `srw_tax` FLOAT DEFAULT NULL,
  `srw_including_tax_amount` VARCHAR(20) DEFAULT NULL,
  `srw_saleszkgs` DATE DEFAULT NULL,
  `srw_salesdate` VARCHAR(20) DEFAULT NULL,
  `srw_salessktj` INT(11) DEFAULT NULL,
  `srw_salesday` DATE DEFAULT NULL,
  `srw_salesyue` VARCHAR(50) DEFAULT NULL,
  `srw_buyer` VARCHAR(50) DEFAULT NULL,
  `srw_belongs_section` VARCHAR(50) DEFAULT NULL,
  `srw_belongs_project` VARCHAR(50) DEFAULT NULL,
  `srw_form` VARCHAR(50) DEFAULT NULL,
  `srw_checkagain_staff` VARCHAR(50) DEFAULT NULL,
  `srw_header_provision` VARCHAR(50) DEFAULT NULL,
  `srw_end_clause` VARCHAR(50) DEFAULT NULL,
  `srw_remark` VARCHAR(50) DEFAULT NULL,
  `srw_auditing` VARCHAR(50) DEFAULT NULL,
  `srw_yn` VARCHAR(50) DEFAULT NULL,
  `srw_custom1` VARCHAR(50) DEFAULT NULL,
  `srw_custom2` VARCHAR(50) DEFAULT NULL,
  `srw_custom3` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`srw_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#销售退货单 详表
CREATE TABLE `sale_return_warehouse_details` (
  `srwd_id` VARCHAR(50) NOT NULL,
  `srw_id` VARCHAR(50) DEFAULT NULL,
  `matter_id` VARCHAR(50) DEFAULT NULL,
  `srwd_engname` VARCHAR(32) DEFAULT NULL,
  `srwd_remark` VARCHAR(50) DEFAULT NULL,
  `srwd_price_include_tax` VARCHAR(50) DEFAULT NULL,
  `srwd_single_status` INT(11) DEFAULT NULL,
  `srwd_document_date` DATE DEFAULT NULL,
  `srwd_document_number` FLOAT DEFAULT NULL,
  `srwd_price` FLOAT DEFAULT NULL,
  `srwd_money` FLOAT DEFAULT NULL,
  `srwd_tax_rate` FLOAT DEFAULT NULL,
  `srwd_tax_amount` FLOAT DEFAULT NULL,
  `srwd_including_tax_amount` FLOAT DEFAULT NULL,
  `srwd_batch_number` VARCHAR(50) DEFAULT NULL,
  `srwd_ifgift` VARCHAR(50) DEFAULT NULL,
  `srwd_invoice_details` VARCHAR(50) DEFAULT NULL,
  `srwd_nomake_invoice_num` INT(11) DEFAULT NULL,
  `srwd_remarks` VARCHAR(300) DEFAULT NULL,
  `srwd_source_order` VARCHAR(50) DEFAULT NULL,
  `srwd_source_no` VARCHAR(50) DEFAULT NULL,
  `srwd_auditing` VARCHAR(50) DEFAULT NULL,
  `srwd_yn` VARCHAR(50) DEFAULT NULL,
  `srwd_custom1` VARCHAR(50) DEFAULT NULL,
  `srwd_custom2` VARCHAR(50) DEFAULT NULL,
  `srwd_custom3` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`srwd_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;





###第三份（郭滔）：22
###预收款单							5
###应收冲款单（预收冲应收、收款冲款）				10
###应收账款账龄分析表					2
###应收账款明细表					2

#应收冲款单（预收冲应收、收款冲款） 主表
CREATE TABLE `advances_received_main` (
  `payables_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '应收冲款单id（主键 唯一）',
  `customer_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '客户表id，外键',
  `payables_customer_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '客户表',
  `scs_id` 		INT(11) 	DEFAULT NULL 	COMMENT '结算方式id，外键',
  `payables_sat_name1` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表默认值：转账',
  `payables_Price1` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `payables_sat_name2` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表默认值：汇票',
  `payables_Price2` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `payables_sat_name3` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表',
  `payables_Price3` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `payables_zhekou` 	INT(4) 		DEFAULT NULL 	COMMENT '折扣率默认值：0.00',
  `payables_endtime` 	DATE 		DEFAULT NULL 	COMMENT '终止账月默认值：当前年月',
  `payables_payablestime` DATETIME 	DEFAULT NULL 	COMMENT '单据日期默认值：当前日期',
  
  `payables_currency_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '币别类型表快照',
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '币别类型表id，外键',
  `payables_currency_inexchange` VARCHAR(20) DEFAULT NULL COMMENT '币别类型表快照',
  `payables_exchange_rate` FLOAT 	DEFAULT NULL 	COMMENT '汇率默认值：1.0000',
  `payables_type` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '应付冲款类型默认值：收款冲款',
  `payables_voucherNo` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '凭证编号',
  `payables_remarks` 	VARCHAR(200) 	DEFAULT NULL 	COMMENT '备注',
  `staff_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '部门员工表id，外键',
  `payables_team_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '部门表',
  `project_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '项目表id，外键',
  `payables_project_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '项目表',
  `payables_billpersonnel` VARCHAR(20) DEFAULT NULL 	COMMENT '制单人员默认值：当前人员',
  `payables_reviewers` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '复核人员',
  `payables_auditstatus` INT(4) 	DEFAULT NULL 	COMMENT '审核状态0:未审核1:已结案',
  `payables_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `payables_yn` 	VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `payables_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `payables_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `payables_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  PRIMARY KEY (`payables_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='应收冲款单（收款冲款+预收冲应收）主表';
#应收冲款单（预收冲应收、收款冲款） 详表	#	DROP TABLE `advances_received_details`;
CREATE TABLE `advances_received_details` (
  `paydetail_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '应收冲款单明细表ID,主键行号',
  `Payables_id` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '应收冲款单主表ID, 外键',
  `customer_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '客户表id，外键',
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '币别类型表id，外键',
  `project_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '项目表id，外键',
  `pade_sourcelist` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '来源单别',
  `pade_sourcetime` 	DATE 		DEFAULT NULL 	COMMENT '来源日期',
  `pade_sourcenumber` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '来源单号',
  `pade_invoiceno` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '发票号码',
  `pade_transaction` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '交易对象供应商编号',
  `pade_transactionname` VARCHAR(20) 	DEFAULT NULL 	COMMENT '交易对象名称',
  `pade_team_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '部门名称',
  `staff_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '部门员工表id，外键',
  `pade_staff_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '采购人员名称',
  `pade_project_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '项目表',
  `pade_currency_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '币别id,币别类型表',
  `pade_currency_inexchange` INT(4) 	DEFAULT NULL 	COMMENT '币别name,币别类型表',
  `pade_price` 		FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货',
  `pade_Currentbalance` FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货现行余额',
  `pade_Discountamount` FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货折让金额',
  `pade_Amountcharged` 	FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货冲款金额',
  `pade_Offsetamount` 	FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货冲抵金额',
  `pade_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `pade_yn` 		VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `pade_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `pade_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `pade_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  PRIMARY KEY (`paydetail_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='应收冲款单（收款冲款+预收冲应收）详表';
#应收冲款单（预收款） 主表	#	DROP TABLE `advances_received_main_y`;
CREATE TABLE `advances_received_main_y` (
  `priabill_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '预收款单主表ID，主键',
  `customer_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '客户表id，外键',
  `priabill_customer_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '客户表名称',
  `scs_id` 		INT(11) 	DEFAULT NULL 	COMMENT '结算方式id，外键',
  `priabill_sat_name1` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表默认值：转账',
  `priabill_Price1` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `priabill_sat_name2` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表默认值：汇票',
  `priabill_Price2` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `priabill_sat_name3` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表',
  `priabill_Price3` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `priabill_zhekou` 	INT(4) 		DEFAULT NULL 	COMMENT '折扣率默认值：0.00',
  `priabill_endtime` 	DATE 		DEFAULT NULL 	COMMENT '终止账月默认值：当前年月',
  `priabill_payablestime` DATETIME 	DEFAULT NULL 	COMMENT '单据日期默认值：当前日期',
  
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '币别类型表id，外键',
  `priabill_currency_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '币别类型表快照',
  `priabill_currency_inexchange` VARCHAR(20) DEFAULT NULL COMMENT '币别类型表快照',
  `payables_exchange_rate` FLOAT 	DEFAULT NULL 	COMMENT '汇率默认值：1.0000',
  `priabill_type` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '应收冲款类型固定值：预付款',
  `priabill_voucherNo` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '凭证编号',
  `staff_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '部门员工表id，外键',
  `priabill_team_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '部门表',
  `project_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '项目表id，外键',
  `priabill_project_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '项目表',
  `priabill_billpersonnel` VARCHAR(20) 	DEFAULT NULL 	COMMENT '制单人员默认值：当前人员',
  `priabill_reviewers` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '复核人员',
  `priabill_remarks` 	VARCHAR(200) 	DEFAULT NULL 	COMMENT '备注',
  `priabill_auditstatus` INT(4) 	DEFAULT NULL 	COMMENT '审核状态0:未审核1:已结案',
  `priabill_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核（）',
  `priabill_yn` 	VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `priabill_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `priabill_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `priabill_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  PRIMARY KEY (`priabill_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='应收冲款单（预收款）主表';
INSERT INTO `advances_received_main_y`(`priabill_id`,`customer_id`,`priabill_customer_name`,`priabill_Price1`,`priabill_Price2`,`priabill_Price3`,`priabill_zhekou`,`priabill_endtime`,`priabill_payablestime`,`currency_id`,`priabill_currency_name`,`payables_exchange_rate`,`priabill_type`,`priabill_voucherNo`,`staff_id`,`priabill_team_name`,`project_id`,`priabill_project_name`,`priabill_billpersonnel`,`priabill_reviewers`,`priabill_remarks`,`priabill_auditstatus`,`priabill_yn`)
VALUES('2019121701','1001','长沙旺牛食品',30000.00,0.00,0.00,0,'2019-12-01','2019-12-17','RMB','人民币','1.0000','预付冲款','','02','直销部','','','当前登录者','当前登录者','',0,0),
('2019121702','1002','郴州正帆',60000.00,0.00,0.00,0,'2019-12-01','2019-12-17','RMB','人民币','1.0000','预付冲款','','02','直销部','','','当前登录者','当前登录者','',0,0),
('2019121801','1003','株洲大为实业',50000.00,0.00,0.00,0,'2019-12-01','2019-12-18','RMB','人民币','1.0000','预付冲款','','02','直销部','','','当前登录者','当前登录者','',0,0);
#应收冲款单（预收款） 详表
CREATE TABLE `advances_received_details_y` (
  `priadetails_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '预收款单明细表ID,主键行号',
  `priabill_id` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '预收款单主表ID,外键',
  `priabill_price` 	FLOAT 		DEFAULT NULL 	COMMENT '预收金额',
  `priabill_type` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '来源单别',
  `priabill_number` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '来源单号',
  `priabill_remarks` 	VARCHAR(100) 	DEFAULT NULL 	COMMENT '摘要',
  `priabill_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `priabill_yn` 	VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `priabill_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `priabill_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `priabill_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  PRIMARY KEY (`Priadetails_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='应收冲款单（预收款）详表';






###第4-7份，采购模块
###第四份（孙威威）：18
###请购单							7
###询价单(要做历史交易查询) 					5
###采购日报表					2
#采购请购表主表
CREATE TABLE t_purchase_requisitions(
	BillNo      	VARCHAR(10)  	COMMENT '单据号码' PRIMARY KEY,
	BillDate    	DATE NOT NULL 	COMMENT '单据日期',
	BillStyleID 	INT NOT NULL 	COMMENT '采购请购类型',
	BillStatus 	INT 		COMMENT '0已结案、1未结案、2无效 单况',
	SalesID     	INT NOT NULL 	COMMENT '请购人员',
	DepartID   	INT NOT NULL 	COMMENT '请购部门',
	Maker	    	VARCHAR(20) 	COMMENT '系统登录人员	制单人员',
	Permitter   	VARCHAR(20) 	COMMENT '系统登录人审核登录名	复核人员',
	Remark      	VARCHAR(20)	COMMENT '备注',
	Column1     	VARCHAR(50) 	COMMENT '备用列1',
	Column2     	VARCHAR(50) 	COMMENT '备用列2',
	Column3     	VARCHAR(50) 	COMMENT '备用列3'
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='采购请购表主表';
#采购请购明细表
CREATE TABLE t_purchase_requisitions_details(
	SerNO         	VARCHAR(10) 	COMMENT '栏号',
	ProdID        	INT NOT NULL 	COMMENT '物料编号',
	ProdName     	VARCHAR(30) 	COMMENT '物料名称',
	ProdSize      	VARCHAR(30) 	COMMENT '规格型号',
	SUnitID       	INT 		COMMENT '单位名称',
	sQuantity    	INT 		COMMENT '默认为0，数量,要有小兰标签，但如果为0，不可保存',
	CurrID        	INT 		COMMENT '币别',
	sPrice        	FLOAT 		COMMENT '标准进价，来源物料主文件，有小兰标签',
	Amount	      	FLOAT 		COMMENT '不可编辑，数量*标准进价	标准进价金额',
	LastestCurrID 	INT 		COMMENT '最后一次交易币别，来源于采购入库单',
	LastestPrice  	FLOAT 		COMMENT '不可编辑	最后一次交易单价，来源于采购入库单',
	LastestAmount 	FLOAT 		COMMENT '不可编辑，数量*标准进价	标准进价金额',
	PreInDate     	DATE NOT NULL 	COMMENT '需求日期，不可大于当前日期',
	SuggestPurDate 	DATE 		COMMENT '建议采购日期，采购提前期',
	QtyRemain     	INT 		COMMENT '未采购量',
	Remark       	VARCHAR(50) 	COMMENT '备注',
	TranType      	VARCHAR(20) 	COMMENT '来源单别，来源于销售订单',
	FromNo        	VARCHAR(20) 	COMMENT '来源单号，来源于销售订单',
	ItemRemark    	VARCHAR(50) 	COMMENT '分录备注'
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='采购请购明细表';
#采购询价表
CREATE TABLE t_purchase_inquiry(
	BillNo     	VARCHAR(10) PRIMARY KEY COMMENT '单据日期+两位流水号	单据号码',
	BillDate   	DATE NOT NULL 	        COMMENT '默认当前日期	单据日期',
	CurrID    	INT NOT NULL 		COMMENT '默认RMB	币别',
	ExchRate   	FLOAT 			COMMENT '默认1:1	汇率',
	CustomerID 	INT 			COMMENT '外键 供应商',
	AddressID  	VARCHAR(50) 	       	COMMENT '供应商地址',
	ValidDate  	DATE 			COMMENT '默认当前日期	有效日期>=当前日期，若过了日期，此单据作废',
	PriceOfTax 	INT 			COMMENT '0未税、1含税	单价是否含税',
	Remark     	VARCHAR(200) 		COMMENT '备注',
	OutAddress 	VARCHAR(200) 		COMMENT '送货地址',
	SalesName  	VARCHAR(200) 		COMMENT '采购人员',
	DepartID   	VARCHAR(20) 		COMMENT '所属部门',
	Maker      	VARCHAR(20) 		COMMENT '当前登录用户	制单人员',
	Permitter  	VARCHAR(20) 		COMMENT '复核人员'
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='采购询价表';
#采购询价明细表
CREATE TABLE t_purchase_inquiry_details(
	SerNO      	VARCHAR(10)      	COMMENT '栏号',
	ProdID     	DATE PRIMARY KEY 	COMMENT '物料编号',
	ProdName  	VARCHAR(30) 	    	COMMENT '物料名称，来源物料主文件',
	ProdSize   	VARCHAR(30)      	COMMENT '规格型号',
	SUnitID    	INT 		    	COMMENT '单位名称，来源物料主文件',
	sQuantity  	INT 		    	COMMENT '默认为0	数量,要有小兰标签，但如果为0，不可保存',
	OldPrice   	FLOAT 	    		COMMENT '标准进价 折扣前单价',
	Discount   	FLOAT 	   		COMMENT '折数（100%），来源物料主文件',
	sPrice     	FLOAT 	    		COMMENT '单价',
	Amount 	   	FLOAT 	    		COMMENT '数量*未含税单价后的总金额	金额',
	TaxRate    	FLOAT 	    		COMMENT '17%	税率（100%）',
	TaxAmt     	FLOAT 	    		COMMENT '由金额交税后的钱	税额',
	VFTotal    	FLOAT NOT NULL   	COMMENT '包含税额的金额	含税金额',
	IsGift 	   	INT 		    	COMMENT '默认为0，否0，是1	是否赠品',
	TranType   	VARCHAR(20)      	COMMENT '不可编辑	来源单别，来源于销售订单',
	FromNo     	VARCHAR(20)      	COMMENT '来源单号，来源于销售订单',
	ItemRemark 	VARCHAR(20)    		COMMENT '分录备注',
	Remark     	VARCHAR(200)     	COMMENT '备注'
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='采购询价明细表';



###第五份（刘佳辉）：18
###采购订货单(要做历史交易查询)				6
###采购费用分摊						7
###采购排行表					2
#采购订单主表
CREATE TABLE `purchasing_order` (
  `po_id` VARCHAR(50) NOT NULL COMMENT '主键 编号',
  `supplier_id` VARCHAR(50) DEFAULT NULL COMMENT '供应商id',
  `po_engname` VARCHAR(32) DEFAULT NULL COMMENT '供应商地址',
  `pot_id` VARCHAR(50) DEFAULT NULL COMMENT '采购订单类型id',
  `po_price_include_tax` VARCHAR(50) DEFAULT NULL COMMENT '单价是否含税',
  `po_single_status` VARCHAR(50) DEFAULT NULL COMMENT '单况',
  `po_document_date` DATE DEFAULT NULL COMMENT '单据日期',
  `po_document_number` VARCHAR(50) DEFAULT NULL COMMENT '单据号码',
  `currency_id` VARCHAR(50) DEFAULT NULL COMMENT '币别id',
  `po_exchange_rate` FLOAT DEFAULT NULL COMMENT '汇率',
  `po_delivery_address` VARCHAR(50) DEFAULT NULL COMMENT '送货地址',
  `po_buyer` VARCHAR(50) DEFAULT NULL COMMENT '采购人员',
  `po_belongs_section` VARCHAR(50) DEFAULT NULL COMMENT '所属部门',
  `po_belongs_project` VARCHAR(50) DEFAULT NULL COMMENT '所属项目',
  `po_header_provision` VARCHAR(50) DEFAULT NULL COMMENT '表头条文',
  `po_end_clause` VARCHAR(50) DEFAULT NULL COMMENT '表尾条文',
  `po_remark` VARCHAR(50) DEFAULT NULL COMMENT '备注',
  `po_audition` VARCHAR(50) DEFAULT NULL COMMENT '是否审核',
  `po_yn` VARCHAR(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `po_custom1` VARCHAR(50) DEFAULT NULL COMMENT '自定栏一',
  `po_custom2` VARCHAR(50) DEFAULT NULL COMMENT '自定栏二',
  `po_custom3` VARCHAR(50) DEFAULT NULL COMMENT '自定栏三',
  PRIMARY KEY (`po_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='采购订单主表';
#采购订单详表
CREATE TABLE `purchasing_order_details` (
  `pod_id` VARCHAR(50) NOT NULL COMMENT '主键 编号',
  `po_id` VARCHAR(50) DEFAULT NULL COMMENT '采购订单主表id not null',
  `po_matter_id` VARCHAR(50) DEFAULT NULL COMMENT '物料编号',
  `pod_matter_name` VARCHAR(50) DEFAULT NULL COMMENT '物料名称',
  `pod_specifications` VARCHAR(50) DEFAULT NULL COMMENT '规格型号',
  `pod_company_name` VARCHAR(50) DEFAULT NULL COMMENT '单位名称',
  `pod_amount` INT(11) DEFAULT NULL COMMENT '数量',
  `pod_money_discount_before` FLOAT DEFAULT NULL COMMENT '折扣前单价',
  `pod_discount_number` VARCHAR(50) DEFAULT NULL COMMENT '折数',
  `pod_price` FLOAT DEFAULT NULL COMMENT '单价',
  `pod_money` FLOAT DEFAULT NULL COMMENT '金额',
  `pod_tax_rate` FLOAT DEFAULT NULL COMMENT '税率',
  `pod_tax_amount` FLOAT DEFAULT NULL COMMENT '税额',
  `pod_include_tax_amount` FLOAT DEFAULT NULL COMMENT '含税金额',
  `pod_beforehand_laidup_date` VARCHAR(50) DEFAULT NULL COMMENT '预计入库日',
  `pod_not_laiup_num` INT(11) DEFAULT NULL COMMENT '未入库量',
  `pod_ifgift` VARCHAR(50) DEFAULT NULL COMMENT '是否赠品 0 否 1 是',
  `pod_remarks` VARCHAR(300) DEFAULT NULL COMMENT '分录备注',
  `pod_source_order` VARCHAR(50) DEFAULT NULL COMMENT '来源单别',
  `pod_source_no` VARCHAR(50) DEFAULT NULL COMMENT '来源单号',
  `pod_audition` VARCHAR(50) DEFAULT NULL COMMENT '是否审核',
  `pod_yn` VARCHAR(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pod_custom1` VARCHAR(50) DEFAULT NULL COMMENT '自定栏一',
  `pod_custom2` VARCHAR(50) DEFAULT NULL COMMENT '自定栏二',
  `pod_custom3` VARCHAR(50) DEFAULT NULL COMMENT '自定栏三',
  PRIMARY KEY (`pod_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='采购订单详表';
#采购分摊主详表

##暂无SQL，要自己写，或者问别的组和自己做同样部分的要一下




###第六份（刘岂均）：28
###采购入库单(要做历史交易查询)				10
###采购退货单						10
###其他入库						4
###其他出库						4
#采购入库主表
CREATE TABLE `purchase_storage` (
  `ps_id` VARCHAR(50) NOT NULL COMMENT '主键 编号',
  `supplier_id` VARCHAR(50) DEFAULT NULL COMMENT '供应商id',
  `ps_engname` VARCHAR(32) DEFAULT NULL COMMENT '供应商地址',
  `pst_id` VARCHAR(50) DEFAULT NULL COMMENT '采购入库类型id',
  `ps_price_include_tax` VARCHAR(50) DEFAULT NULL COMMENT '单价是否含税',
  `warehouse_id` INT(11) DEFAULT NULL COMMENT '仓库id',
  `ps_single_status` VARCHAR(50) DEFAULT NULL COMMENT '凭证编号',
  `ps_document_date` DATE DEFAULT NULL COMMENT '单据日期',
  `ps_document_number` VARCHAR(50) DEFAULT NULL COMMENT '单据号码',
  `currency_id` VARCHAR(50) DEFAULT NULL COMMENT '币别id',
  `ps_exchange_rate` FLOAT DEFAULT NULL COMMENT '汇率',
  `ps_foreign_trade` INT(11) DEFAULT NULL COMMENT '国外贸易 默认否',
  `ps_sunnum` INT(11) DEFAULT NULL COMMENT '总数量',
  `ps_sunmoney` FLOAT DEFAULT NULL COMMENT '总金额',
  `ps_tax` FLOAT DEFAULT NULL COMMENT '总税额',
  `ps_include_tax_amount` FLOAT DEFAULT NULL COMMENT '含税总金额',
  `ps_delivery_address` VARCHAR(50) DEFAULT NULL COMMENT '送货地址',
  `ps_buyer` VARCHAR(50) DEFAULT NULL COMMENT '采购人员',
  `ps_belongs_section` VARCHAR(50) DEFAULT NULL COMMENT '所属部门',
  `ps_belongs_project` VARCHAR(50) DEFAULT NULL COMMENT '所属项目',
  `ps_executor` VARCHAR(50) DEFAULT NULL COMMENT '制单人员',
  `ps_checkagain_staff` VARCHAR(50) DEFAULT NULL COMMENT '复核人员',
  `ps_header_provision` VARCHAR(50) DEFAULT NULL COMMENT '表头条文',
  `ps_end_clause` VARCHAR(50) DEFAULT NULL COMMENT '表尾条文',
  `ps_remark` VARCHAR(50) DEFAULT NULL COMMENT '备注',
  `ps_audition` VARCHAR(50) DEFAULT NULL COMMENT '是否审核',
  `ps_yn` VARCHAR(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `ps_custom1` VARCHAR(50) DEFAULT NULL COMMENT '自定栏一',
  `ps_custom2` VARCHAR(50) DEFAULT NULL COMMENT '自定栏二',
  `ps_custom3` VARCHAR(50) DEFAULT NULL COMMENT '自定栏三',
  `ps_custom4` VARCHAR(50) DEFAULT NULL COMMENT '自定栏四',
  `ps_custom5` VARCHAR(50) DEFAULT NULL COMMENT '自定栏五',
  `ps_custom6` VARCHAR(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`ps_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='采购入库主表';
#采购入库详表
CREATE TABLE `purchase_storage_details` (
  `psd_id` VARCHAR(50) NOT NULL,
  `ps_id` VARCHAR(50) DEFAULT NULL,
  `matter_id` VARCHAR(50) DEFAULT NULL,
  `psd_engname` VARCHAR(50) DEFAULT NULL,
  `psd_remark` VARCHAR(50) DEFAULT NULL,
  `psd_price_include_tax` VARCHAR(50) DEFAULT NULL,
  `psd_single_status` INT(50) DEFAULT NULL,
  `psd_document_date` DATE DEFAULT NULL,
  `psd_document_number` VARCHAR(50) DEFAULT NULL,
  `psd_price` FLOAT DEFAULT NULL,
  `psd_money` FLOAT DEFAULT NULL,
  `psd_tax_rate` FLOAT DEFAULT NULL,
  `psd_tax_amount` FLOAT DEFAULT NULL,
  `psd_including_tax_amount` FLOAT DEFAULT NULL,
  `psd_batch_number` VARCHAR(50) DEFAULT NULL,
  `psd_ifgift` VARCHAR(50) DEFAULT NULL,
  `psd_invoice_details` VARCHAR(50) DEFAULT NULL,
  `psd_remarks` VARCHAR(300) DEFAULT NULL,
  `psd_source_order` VARCHAR(50) DEFAULT NULL,
  `psd_source_no` VARCHAR(50) DEFAULT NULL,
  `psd_auditing` VARCHAR(50) DEFAULT NULL,
  `psd_yn` VARCHAR(50) DEFAULT '0',
  `psd_custom1` VARCHAR(50) DEFAULT NULL,
  `psd_custom2` VARCHAR(50) DEFAULT NULL,
  `psd_custom3` VARCHAR(50) DEFAULT NULL,
  `psd_custom4` VARCHAR(50) DEFAULT NULL,
  `psd_custom5` VARCHAR(50) DEFAULT NULL,
  `psd_custom6` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`psd_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#采购退货主表
CREATE TABLE `purchase_returns` (
  `pure_id` VARCHAR(50) NOT NULL COMMENT '主键 编号',
  `supplier_id` VARCHAR(50) DEFAULT NULL COMMENT '供应商id',
  `pure_engname` VARCHAR(32) DEFAULT NULL COMMENT '供应商地址',
  `puret_id` VARCHAR(50) DEFAULT NULL COMMENT '采购退货类型id',
  `pure_price_include_tax` VARCHAR(50) DEFAULT NULL COMMENT '单价是否含税',
  `warehouse_id` INT(11) DEFAULT NULL COMMENT '仓库id',
  `pure_single_status` VARCHAR(50) DEFAULT NULL COMMENT '凭证编号',
  `pure_document_date` DATE DEFAULT NULL COMMENT '单据日期',
  `pure_document_number` VARCHAR(50) DEFAULT NULL COMMENT '单据号码',
  `currency_id` VARCHAR(50) DEFAULT NULL COMMENT '币别id',
  `pure_exchange_rate` FLOAT DEFAULT NULL COMMENT '汇率',
  `pure_foreign_trade` INT(11) DEFAULT NULL COMMENT '国外贸易 默认否',
  `pure_sunnum` INT(11) DEFAULT NULL COMMENT '总数量',
  `pure_sunmoney` FLOAT DEFAULT NULL COMMENT '总金额',
  `pure_tax` FLOAT DEFAULT NULL COMMENT '总税额',
  `pure_include_tax_amount` FLOAT DEFAULT NULL COMMENT '含税总金额',
  `pure_delivery_address` VARCHAR(50) DEFAULT NULL COMMENT '送货地址',
  `pure_buyer` VARCHAR(50) DEFAULT NULL COMMENT '采购人员',
  `pure_belongs_section` VARCHAR(50) DEFAULT NULL COMMENT '所属部门',
  `pure_belongs_project` VARCHAR(50) DEFAULT NULL COMMENT '所属项目',
  `pure_executor` VARCHAR(50) DEFAULT NULL COMMENT '制单人员',
  `pure_checkagain_staff` VARCHAR(50) DEFAULT NULL COMMENT '复核人员',
  `pure_header_provision` VARCHAR(50) DEFAULT NULL COMMENT '表头条文',
  `pure_end_clause` VARCHAR(50) DEFAULT NULL COMMENT '表尾条文',
  `pure_remark` VARCHAR(50) DEFAULT NULL COMMENT '备注',
  `pure_audition` VARCHAR(50) DEFAULT NULL COMMENT '是否审核',
  `pure_yn` VARCHAR(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pure_custom1` VARCHAR(50) DEFAULT NULL COMMENT '自定栏一',
  `pure_custom2` VARCHAR(50) DEFAULT NULL COMMENT '自定栏二',
  `pure_custom3` VARCHAR(50) DEFAULT NULL COMMENT '自定栏三',
  PRIMARY KEY (`pure_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='采购退货主表';
#采购退货详表
CREATE TABLE `purchase_returns_details` (
  `pured_id` VARCHAR(50) NOT NULL,
  `pure_id` VARCHAR(50) DEFAULT NULL,
  `matter_id` VARCHAR(50) DEFAULT NULL,
  `pured_engname` VARCHAR(32) DEFAULT NULL,
  `pured_remark` VARCHAR(50) DEFAULT NULL,
  `pured_price_include_tax` VARCHAR(50) DEFAULT NULL,
  `pured_single_status` INT(11) DEFAULT NULL,
  `pured_document_date` DATE DEFAULT NULL,
  `pured_document_number` VARCHAR(50) DEFAULT NULL,
  `pured_price` FLOAT DEFAULT NULL,
  `pured_money` FLOAT DEFAULT NULL,
  `pured_tax_rate` FLOAT DEFAULT NULL,
  `pured_tax_amount` FLOAT DEFAULT NULL,
  `pured_including_tax_amount` FLOAT DEFAULT NULL,
  `pured_batch_number` VARCHAR(50) DEFAULT NULL,
  `pured_ifgift` VARCHAR(50) DEFAULT NULL,
  `pured_invoice_details` VARCHAR(50) DEFAULT NULL,
  `pured_remarks` VARCHAR(300) DEFAULT NULL,
  `pured_source_order` VARCHAR(50) DEFAULT NULL,
  `pured_source_no` VARCHAR(50) DEFAULT NULL,
  `pured_auditing` VARCHAR(50) DEFAULT NULL,
  `pured_yn` VARCHAR(50) DEFAULT '0',
  `pured_custom1` VARCHAR(50) DEFAULT NULL,
  `pured_custom2` VARCHAR(50) DEFAULT NULL,
  `pured_custom3` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`pured_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;





###第七份（陈扬航）：21
###预付款单							5
###应付冲款单（预付冲应付、付款冲款）			10
###应付账款明细表					2
#应付冲款单（预付冲应付、付款冲款）主表
CREATE TABLE `payables_main` (
  `payables_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '应付冲款单id（主键 唯一）',
  `supplier_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '供应商表id，外键',
  `payables_supplier_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '供应商表',
  `scs_id` 		INT(11) 	DEFAULT NULL 	COMMENT '结算方式id，外键',
  `payables_sat_name1` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表默认值：转账',
  `payables_Price1` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `payables_sat_name2` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表默认值：汇票',
  `payables_Price2` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `payables_sat_name3` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表',
  `payables_Price3` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `payables_zhekou` 	INT(4) 		DEFAULT NULL 	COMMENT '折扣率默认值：0.00',
  `payables_endtime` 	DATE 		DEFAULT NULL 	COMMENT '终止账月默认值：当前年月',
  `payables_payablestime` DATETIME 	DEFAULT NULL 	COMMENT '单据日期默认值：当前日期',
  
  `payables_currency_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '币别类型表快照',
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '币别类型表id，外键',
  `payables_currency_inexchange` VARCHAR(20) DEFAULT NULL COMMENT '币别类型表快照',
  `payables_exchange_rate` FLOAT 	DEFAULT NULL 	COMMENT '汇率默认值：1.0000',
  `payables_type` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '应付冲款类型默认值：付款冲款',
  `payables_voucherNo` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '凭证编号',
  `payables_remarks` 	VARCHAR(200) 	DEFAULT NULL 	COMMENT '备注',
  `staff_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '部门员工表id，外键',
  `payables_team_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '部门表',
  `project_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '项目表id，外键',
  `payables_project_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '项目表',
  `payables_billpersonnel` VARCHAR(20) DEFAULT NULL 	COMMENT '制单人员默认值：当前人员',
  `payables_reviewers` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '复核人员',
  `payables_auditstatus` INT(4) 	DEFAULT NULL 	COMMENT '审核状态0:未审核1:已结案',
  `payables_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `payables_yn` 	VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `payables_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `payables_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `payables_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  PRIMARY KEY (`payables_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='应付冲款单主表（付款冲款+预付冲应付）';
#应付冲款单（预付冲应付、付款冲款）详表
CREATE TABLE `payables_detail` (
  `paydetail_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '应付冲款单明细表ID,主键行号',
  `Payables_id` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '应付冲款单主表ID, 外键',
  `supplier_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '供应商表id，外键',
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '币别类型表id，外键',
  `project_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '项目表id，外键',
  `pade_sourcelist` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '来源单别',
  `pade_sourcetime` 	DATE 		DEFAULT NULL 	COMMENT '来源日期',
  `pade_sourcenumber` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '来源单号',
  `pade_invoiceno` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '发票号码',
  `pade_transaction` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '交易对象供应商编号',
  `pade_transactionname` VARCHAR(20) 	DEFAULT NULL 	COMMENT '交易对象名称',
  `pade_team_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '部门名称',
  `staff_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '部门员工表id，外键',
  `pade_staff_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '采购人员名称',
  `pade_project_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '项目表',
  `pade_currency_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '币别id,币别类型表',
  `pade_currency_inexchange` INT(4) 	DEFAULT NULL 	COMMENT '币别name,币别类型表',
  `pade_price` 		FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货',
  `pade_Currentbalance` FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货现行余额',
  `pade_Discountamount` FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货折让金额',
  `pade_Amountcharged` 	FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货冲款金额',
  `pade_Offsetamount` 	FLOAT 		DEFAULT NULL 	COMMENT '采购入库，采购退货冲抵金额',
  `pade_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `pade_yn` 		VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `pade_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `pade_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `pade_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  PRIMARY KEY (`paydetail_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='应付冲款单详表（付款冲款+预付冲应付）';
#应付冲款单（预付款）主表
CREATE TABLE `priabill_main` (
  `priabill_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '预付款单主表ID，主键',
  `supplier_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '供应商表id，外键',
  `priabill_supplier_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '供应商名称',
  `scs_id` 		INT(11) 	DEFAULT NULL 	COMMENT '结算方式id，外键',
  `priabill_sat_name1` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表默认值：转账',
  `priabill_Price1` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `priabill_sat_name2` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表默认值：汇票',
  `priabill_Price2` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `priabill_sat_name3` 	INT(4) 		DEFAULT NULL 	COMMENT '结算方式表',
  `priabill_Price3` 	FLOAT 		DEFAULT NULL 	COMMENT '默认值：0.00',
  `priabill_zhekou` 	INT(4) 		DEFAULT NULL 	COMMENT '折扣率默认值：0.00',
  `priabill_endtime` 	DATE 		DEFAULT NULL 	COMMENT '终止账月默认值：当前年月',
  `priabill_payablestime` DATETIME 	DEFAULT NULL 	COMMENT '单据日期默认值：当前日期',
  
  `currency_id` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '币别类型表id，外键',
  `priabill_currency_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '币别类型表快照',
  `priabill_currency_inexchange` VARCHAR(20) DEFAULT NULL COMMENT '币别类型表快照',
  `payables_exchange_rate` FLOAT 	DEFAULT NULL 	COMMENT '汇率默认值：1.0000',
  `priabill_type` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '应付冲款类型默认值：预付款',
  `priabill_voucherNo` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '凭证编号',
  `staff_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '部门员工表id，外键',
  `priabill_team_name` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '部门表',
  `project_id` 		VARCHAR(50) 	DEFAULT NULL 	COMMENT '项目表id，外键',
  `priabill_project_name` VARCHAR(20) 	DEFAULT NULL 	COMMENT '项目表',
  `priabill_billpersonnel` VARCHAR(20) 	DEFAULT NULL 	COMMENT '制单人员默认值：当前人员',
  `priabill_reviewers` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '复核人员',
  `priabill_remarks` 	VARCHAR(200) 	DEFAULT NULL 	COMMENT '备注',
  `priabill_auditstatus` INT(4) 	DEFAULT NULL 	COMMENT '审核状态0:未审核1:已结案',
  `priabill_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `priabill_yn` 	VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `priabill_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `priabill_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `priabill_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  PRIMARY KEY (`priabill_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
#应付冲款单（预付款）详表
CREATE TABLE `priabill_details` (
  `priadetails_id` 	VARCHAR(50) 	NOT NULL 	COMMENT '预付款单明细表ID, 主键行号',
  `priabill_id` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '预付款单主表ID,   外键',
  `priabill_price` 	FLOAT 		DEFAULT NULL 	COMMENT '预付金额',
  `priabill_type` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '来源单别',
  `priabill_number` 	VARCHAR(20) 	DEFAULT NULL 	COMMENT '来源单号',
  `priabill_remarks` 	VARCHAR(100) 	DEFAULT NULL 	COMMENT '摘要',
  `priabill_Auditing` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '是否审核',
  `priabill_yn` 	VARCHAR(50) 	DEFAULT '0' 	COMMENT '是否删除（0 否 1 是 ，默认0）',
  `priabill_custom1` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏一',
  `priabill_custom2` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏二',
  `priabill_custom3` 	VARCHAR(50) 	DEFAULT NULL 	COMMENT '自定栏三',
  PRIMARY KEY (`Priadetails_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;






###第8份，库存模块（不负责基本数据的维护）
###第八份（杨威）：24
###调拨单							6
###盘点单							6
###库存成本调整(调价单)					6
###库存台账						2
###库存进出明细表					2
###库存呆滞品分析表					2
CREATE TABLE `allocation_primary_bill` (
  `apbid` VARCHAR(20) NOT NULL COMMENT '单据编号',
  `apbDate` DATE NOT NULL COMMENT '单据日期',
  `foldWarehouseid` VARCHAR(20) NOT NULL COMMENT '调入仓库',
  `exportWarehouseid` VARCHAR(20) NOT NULL COMMENT '调出仓库',
  `documentMaker` VARCHAR(20) NOT NULL COMMENT '制单人编号',
  `Verifier` VARCHAR(20) NOT NULL COMMENT '审核人编号',
  `remark` TEXT COMMENT '备注',
  `custom1` VARCHAR(50) DEFAULT NULL COMMENT '自定义一',
  `custom2` VARCHAR(50) DEFAULT NULL COMMENT '自定义二',
  `standby` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`apbid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='调拨单主表';

CREATE TABLE `allocation_schedule_bill` (
  `asbid` INT(8) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `apbid` VARCHAR(20) NOT NULL COMMENT '主表单据编号',
  `stockNumber` VARCHAR(20) NOT NULL COMMENT '物料编号',
  `amout` VARCHAR(20) NOT NULL COMMENT '数量',
  `remark` TEXT COMMENT '分录备注',
  `standby` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`asbid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='调拨单详表';

CREATE TABLE `blitem_primary_bill` (
  `bpbid` VARCHAR(20) NOT NULL COMMENT '单据编号',
  `bpbDate` DATE NOT NULL COMMENT '单据日期',
  `warehouseid` VARCHAR(20) NOT NULL COMMENT '盘点仓库编号',
  `inventoryChecker` VARCHAR(20) NOT NULL COMMENT '盘点人编号',
  `documentMaker` VARCHAR(20) NOT NULL COMMENT '制单人编号',
  `verifier` VARCHAR(20) NOT NULL COMMENT '审核人编号',
  `remark` TEXT COMMENT '备注',
  `custom1` VARCHAR(50) DEFAULT NULL COMMENT '自定义一',
  `custom2` VARCHAR(50) DEFAULT NULL COMMENT '自定义二',
  `standby` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`bpbid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='盘点单主表';

CREATE TABLE `blitem_schedule_bill` (
  `bsbid` INT(8) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `bpbid` VARCHAR(20) NOT NULL COMMENT '主表单据编号',
  `stockNumber` VARCHAR(20) NOT NULL COMMENT '物料编号',
  `bookAmout` VARCHAR(20) NOT NULL COMMENT '账面数量',
  `blitemAmout` VARCHAR(20) NOT NULL COMMENT '盘点数量',
  `PALAmout` VARCHAR(20) NOT NULL COMMENT '盈亏数量',
  `cause` VARCHAR(50) DEFAULT NULL COMMENT '原因',
  `standby` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`bsbid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='盘点单详表';

CREATE TABLE `chartofaccountsbill` (
  `coabid` INT(4) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `coaname` VARCHAR(50) DEFAULT NULL COMMENT '名称',
  `standby1` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  `standby2` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`coabid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='会计科目表';

CREATE TABLE `deadstockintervalbill` (
  `dsibid` INT(4) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `startDay` INT(4) NOT NULL COMMENT '起始天数',
  `overDay` INT(4) NOT NULL COMMENT '截至天数',
  `dsiexplain` VARCHAR(50) NOT NULL COMMENT '区间说明',
  `standby` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`dsibid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='呆滞区间表';

CREATE TABLE `discountprimarybill` (
  `dpbid` VARCHAR(20) NOT NULL COMMENT '单据编号',
  `dpbDate` DATE NOT NULL COMMENT '单据日期',
  `appreciationItem` VARCHAR(20) NOT NULL COMMENT '增值科目编号',
  `impairmentItem` VARCHAR(20) NOT NULL COMMENT '减值科目编号',
  `straighteningMethod` VARCHAR(20) NOT NULL COMMENT '调整方式',
  `documentMaker` VARCHAR(20) NOT NULL COMMENT '制单人编号',
  `verifier` VARCHAR(20) NOT NULL COMMENT '审核人编号',
  `remark` TEXT COMMENT '备注',
  `custom1` VARCHAR(50) DEFAULT NULL COMMENT '自定义一',
  `custom2` VARCHAR(50) DEFAULT NULL COMMENT '自定义二',
  `standby` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`dpbid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='调价单主表';

CREATE TABLE `discountschedulebill` (
  `dsbid` INT(8) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `dpbid` VARCHAR(20) NOT NULL COMMENT '主表单据编号',
  `stockNumber` VARCHAR(20) NOT NULL COMMENT '物料编号',
  `discountPrice` FLOAT NOT NULL COMMENT '调价金额',
  `remark` TEXT COMMENT '分录备注',
  `standby` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`dsbid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='调价单详表';

CREATE TABLE `stockprimarybill` (
  `spbid` INT(8) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `spbDate` DATE NOT NULL COMMENT '单据日期',
  `warehouseid` INT(8) NOT NULL COMMENT '仓库编号',
  `stocktype` VARCHAR(20) NOT NULL COMMENT '单据类型',
  `standby` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`spbid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='库存进出主表';

CREATE TABLE `stockschedulebill` (
  `ssbid` INT(8) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `spbid` INT(8) NOT NULL COMMENT '主表单据编号',
  `stockNumber` VARCHAR(20) NOT NULL COMMENT '物料编号',
  `amount` INT(8) NOT NULL COMMENT '数量',
  `standby` VARCHAR(50) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`ssbid`)
) ENGINE=MYISAM DEFAULT CHARSET=gbk COMMENT='库存进出详表';







