// 是否含税 下拉列表中的值
var whetherTheTaxData = [{
		'text': '未税',
		"value": "weishui"
	},
	{
		'text': '含税',
		"value": "hanshui"
	}
];
// 是否含税 的Store对象 
var whetherTheTaxStore = Ext.create('Ext.data.Store', {
	fields: ['text', 'value'],
	data: whetherTheTaxData
});

// 付款条件 下拉列表中的值
var paymentClauseData = [{
		'text': '货到',
		"value": "huodao"
	},
	{
		'text': '次月',
		"value": "ciyue"
	},
	{
		'text': '月结',
		"value": "yuejie"
	},
	{
		'text': '其他',
		"value": "qita"
	}
];
// 付款条件 的Store对象 
var paymentClauseStore = Ext.create('Ext.data.Store', {
	fields: ['text', 'value'],
	data: paymentClauseData
});

Ext.create('Ext.data.Store', {
	storeId: 'simpsonsStore',
	fields: ['columnNo', 'stockNumber', 'nameOfMaterial', 'specification', 'unit', 'quantity', 'unitPriceBeforeDiscount', 'foldTheNumber', 'price', 'money', 'taxRate', 'tax', 'taxAmount', 'batchNumber', 'complimentary', 'detailsOfTheInvoice', 'uninvoicedAmount', 'entryNote', 'sourceSingleType', 'sourceSingleNo', 'wentDutch'],
	data: {
		'items': [{
				"columnNo": "1",
				"stockNumber": "C01-W-HP-DC7900-307",
				"nameOfMaterial": "HP DC7900CMT-NA307PA#AB2台式机",
				"specification": "Lisa",
				"unit": "lisa@simpsons.com",
				"quantity": "555-111-1224",
				"unitPriceBeforeDiscount": "Lisa",
				"foldTheNumber": "lisa@simpsons.com",
				"price": "555-111-1224",
				"money": "Lisa",
				"taxRate": "lisa@simpsons.com",
				"tax": "555-111-1224",
				"taxAmount": "Lisa",
				"batchNumber": "lisa@simpsons.com",
				"complimentary": "555-111-1224",
				"detailsOfTheInvoice": "Lisa",
				"uninvoicedAmount": "lisa@simpsons.com",
				"entryNote": "555-111-1224",
				"sourceSingleType": "Lisa",
				"sourceSingleNo": "lisa@simpsons.com",
				"wentDutch": "555-111-1224"
			},
			{
				"columnNo": "2",
				"stockNumber": "C01-W-HP-DC7900-307",
				"nameOfMaterial": "HP DC7900CMT-NA307PA#AB2台式机",
				"specification": "Lisa",
				"unit": "lisa@simpsons.com",
				"quantity": "555-111-1224",
				"unitPriceBeforeDiscount": "Lisa",
				"foldTheNumber": "lisa@simpsons.com",
				"price": "555-111-1224",
				"money": "Lisa",
				"taxRate": "lisa@simpsons.com",
				"tax": "555-111-1224",
				"taxAmount": "Lisa",
				"batchNumber": "lisa@simpsons.com",
				"complimentary": "555-111-1224",
				"detailsOfTheInvoice": "Lisa",
				"uninvoicedAmount": "lisa@simpsons.com",
				"entryNote": "555-111-1224",
				"sourceSingleType": "Lisa",
				"sourceSingleNo": "lisa@simpsons.com",
				"wentDutch": "555-111-1224"
			}
		]
	},
	proxy: {
		type: 'memory',
		reader: {
			type: 'json',
			root: 'items'
		}
	}
});

var grid = Ext.create('Ext.grid.Panel', {
	id: 'grid',
	store: Ext.data.StoreManager.lookup('simpsonsStore'),
	columnLines: true,
	border : 0,				//边框
	width: 676,				//长度
	height: 112,			//宽度
	frame: false,			//true：有边框；false：无边框
	//iconCls: 'icon-grid',	//标题栏，下面这个是标题内容
	//title: 'Framed with Checkbox Selection and Horizontal Scrolling',
	margin: '0 0 0 0',		//外边距
	//renderTo: Ext.getBody(),
    features: [{
        id: 'group',
        ftype: 'groupingsummary',
        groupHeaderTpl: '{name}',
        hideGroupedHeader: true,
        enableGroupingMenu: false
    }, {
        ftype: 'summary',
        dock: 'bottom'
    }],
	columns: [{
			text: '(栏号)',
			dataIndex: 'columnNo',
			width: 70,
//          sortable: true,
//          summaryType: 'max',
//          renderer: Ext.util.Format.dateRenderer('m/d/Y'),
//          summaryRenderer: Ext.util.Format.dateRenderer('m/d/Y'),
//          field: {
//              xtype: 'datefield'
//          }
		},
		{
			text: '物料编号',
			dataIndex: 'stockNumber',
		},
		{
			text: '(物料名称)',
			dataIndex: 'nameOfMaterial'
		},
		{
			text: '(规格型号)',
			dataIndex: 'specification'
		},
		{
			text: '(单位名称)',
			dataIndex: 'unit'
		},
		{
			text: '数量',
			dataIndex: 'quantity'
		},
		{
			text: '折扣前单价',
			dataIndex: 'unitPriceBeforeDiscount'
		},
		{
			text: '折数(%)',
			dataIndex: 'foldTheNumber'
		},
		{
			text: '单价',
			dataIndex: 'price'
		},
		{
			text: '金额',
			dataIndex: 'money'
		},
		{
			text: '税率(%)',
			dataIndex: 'taxRate'
		},
		{
			text: '(税额)',
			dataIndex: 'tax'
		},
		{
			text: '(含税金额)',
			dataIndex: 'taxAmount'
		},
		{
			text: '(批号)',
			dataIndex: 'batchNumber'
		},
		{
			text: '赠品',
			dataIndex: 'complimentary'
		},
		{
			text: '(发票明细)',
			dataIndex: 'detailsOfTheInvoice'
		},
		{
			text: '(未开票金额)',
			dataIndex: 'uninvoicedAmount'
		},
		{
			text: '分录备注',
			dataIndex: 'entryNote'
		},
		{
			text: '(来源单别)',
			dataIndex: 'sourceSingleType'
		},
		{
			text: '(来源单号)',
			dataIndex: 'sourceSingleNo'
		},
		{
			text: '(分摊费用)',
			dataIndex: 'wentDutch'
		}
	],
});

// 创建 from.Panel 面板,然后内嵌到 Window 面板中
var formControl = Ext.create('Ext.form.Panel', {
	border: false,
	fieldDefaults: {
		msgTarget: "side", // 错误提示信息在右旁边显示图标
		labelWidth: 79,
		labelAlign: "right",
		margin: 1,
	},
	//defaultType : 'textfield',
	layout: "anchor",
	items: [{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'textfield',
					name: 'supplier',
					id: 'supplier',
					fieldLabel: "供应商",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false, //设置必填项		验证并提示错误信息
					width: '50%',
				},
				{
					xtype: 'datefield',
					name: 'documentDate',
					id: 'documentDate',
					fieldLabel: "单据日期",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
					format: 'Y-m-d',
					width: '50%',
				}
			]
		},
		{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'textfield',
					name: 'supplierAddress',
					id: 'supplierAddress',
					fieldLabel: "供应商地址",
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'documentNumber',
					id: 'documentNumber',
					fieldLabel: "单据号码",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
					width: '50%',
				},
			]
		},
		{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'textfield',
					name: 'typeOfPurchaseWarehousing',
					id: 'typeOfPurchaseWarehousing',
					fieldLabel: "采购入库类型",
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'currency',
					id: 'currency',
					fieldLabel: "币别",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
					width: '50%',
				},
			]
		},
		{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'combobox',
					name: 'whetherTheTax',
					id: 'whetherTheTax',
					fieldLabel: "单价是否含税",
					store: whetherTheTaxStore,
					queryMode: 'local',
					displayField: 'text',
					valueField: 'value',
					emptyText: '请选择',
					//blankText: '请选择籍贯',
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'exchangeRate',
					id: 'exchangeRate',
					fieldLabel: "汇率",
					width: '50%',
				},
			]
		},
		{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'textfield',
					name: 'warehouse',
					id: 'warehouse',
					fieldLabel: "仓库",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'externalTrade',
					id: 'externalTrade',
					fieldLabel: "国外贸易",
					width: '50%',
				},
			]
		},
		{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'textfield',
					name: 'proofNumber',
					id: 'proofNumber',
					fieldLabel: "凭证编号",
					width: '50%',
				},
				{
					xtype: 'fieldcontainer', // fieldcontainer
					fieldLabel: '',
					defaultType: 'checkboxfield', // checkbox
					defaults: {
						flex: 1
					},
					layout: 'hbox',
					width: '50%',
					items: [{
						boxLabel: '复核后自动生成发票',
						name: 'check1',
						inputValue: '1',
						id: 'check1',
						checked: false
					}]
				},
			]
		},
		{
			xtype: 'tabpanel',
			plain: true,
			activeTab: 0,
			height: 137,
			margin: '-3 3 0 3',			//设置四面外边距，可负数
			defaults: {
				bodyStyle: 'padding:0px'
			},
			items: [{
				title: '内容',
				defaults: {
					width: 230				//此属性无用
				},
				defaultType: 'textfield',
				items: grid,				//Tab1 列表
			}, {
				title: '帐款',
				defaults: {
					width: 545
				},
				defaultType: 'textfield',
				items: [,
				{
					xtype: "container",
					layout: 'hbox',
					items: [{
							xtype: 'textfield',
							name: 'accountOwnership',
							id: 'accountOwnership',
							fieldLabel: "帐款归属",
							labelSeparator: "<font color ='red'>*</font>:",
							allowBlank: false,
							width: '50%',
						},
						{
							xtype: 'datefield',
							name: 'dateOfPayment',
							id: 'dateOfPayment',
							fieldLabel: "付款日期",
							format: 'Y-m-d',
							width: '50%',
						},
					]
				}, {
					xtype: "container",
					layout: 'hbox',
					items: [{
							xtype: 'textfield',
							name: 'paymentClause',
							id: 'paymentClause',
							fieldLabel: "付款条件",
							width: '50%',
						},
						{
							xtype: 'datefield',
							name: 'inTheAccountReceivable',
							id: 'inTheAccountReceivable',
							fieldLabel: "账款月份",
							format: 'Y-m',
							width: '50%',
						},
					]
				}]
			}, {
				defaultType: 'textfield',
				cls: 'x-plain',
				title: '备注',
				layout: 'fit',
				defaults: {
					width: 545
				},
				margin : 2,
				items: {
					xtype: 'htmleditor',
					name: 'bio2',
					fieldLabel: '备注'
				}
			}]
		},
		{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'textfield',
					name: 'buyer',
					id: 'buyer',
					fieldLabel: "采购人员",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'makingPersonnel',
					id: 'makingPersonnel',
					fieldLabel: "制单人员",
					width: '50%',
				},
			]
		},
		{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'textfield',
					name: 'department',
					id: 'department',
					fieldLabel: "所属部门",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'reviewingOfficer',
					id: 'reviewingOfficer',
					fieldLabel: "复核人员",
					width: '50%',
				},
			]
		},
		{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'textfield',
					name: 'subordinateToTheProject',
					id: 'subordinateToTheProject',
					fieldLabel: "所属项目",
					width: '50%',
				},
				{},
			]
		},
	]
});

//创建活动的Window窗体
var PurchaseEnterWarehouse = Ext.create('Ext.window.Window', {
	id: "PurchaseEnterWarehouseWindow",
	title: "采购入库单",
	width: 579,
	height: 447,
	layout: 'fit',
 	//autoScroll: false,	// 容器过高或者过宽时，窗体自动显示滚动条 - 无效
    modal: false,
	closable: true, 	// Extjs Window可以配置是否显示关闭按钮：
	closeAction: 'hide',// 在关闭Extjs Window的时候，通过配置项closeAction可以控制按钮是销毁（destroy）还是隐藏（hide），默认情况下为销毁：
	maximizable: true, 	// 最大化按钮
	minimizable: true, 	// 最小化按钮;需重写minimize()函数;
	constrain: true,	// 保证整个窗口不会越过浏览器的边界;
	resizable: true,   	// 窗口可拖动改变大小;
	items: formControl,
	//anchor:"100% 100%",
	buttons: [{
			xtype: 'button',
			text: "新增",
			handler: showValue
		}, {
			xtype: 'button',
			text: "删除",
			handler: onUserSaveClick
		}, {
			xtype: 'button',
			text: "修改",
			handler: function(){
				alert("修改按钮");
			}
		}, {
			xtype: 'button',
			text: "保存",
			handler: showValue
		}, {
			xtype: 'button',
			text: "审核",
			handler: onUserSaveClick
		}, {
			xtype: 'button',
			text: "刷新",
			handler: onUserSaveClick
		}
	],
	listeners: {
		// 最小化
		minimize: function(win, opts) {
			win.collapse();
		}
	}
});
//}).show();

//
function showValue() {
	var svalue = Ext.getCmp('supplier').getValue() + "---" +
		Ext.getCmp('documentDate').getValue() + "---" +
		Ext.getCmp('address').getValue() + "---" +
		Ext.getCmp('dateLibary').getValue() + "---" +
		Ext.getCmp('dateReg').getValue() + "---单选1: " +
		Ext.getCmp('color').getChecked()[0].boxLabel + "---单选1: " +
		Ext.getCmp('color').getChecked()[0].inputValue + "---复选 : " +
		// Ext.getCmp('radio1').getValue() + "---单选2: " + 
		// Ext.getCmp('radio2').getValue() + "---复选 " + 
		Ext.getCmp('check1').getValue() + "---" +
		Ext.getCmp('check2').getValue() + "---" +
		Ext.getCmp('check3').getValue() + "---" +
		Ext.getCmp('cmjiguan').getValue() + "---" +
		Ext.getCmp('remark').getValue();

	Ext.getCmp('remark').setValue(svalue);
}

// 结果集的保存--修改
function onUserSaveClick() {
	display = "操作失败,请重新 进行操作";
	var tuserID = Ext.getCmp('name').getValue();
	var form = formControl.getForm();
	if(form.isValid()) {
		if(tuserID.length > 0) // 更新 
		{
			console.info("正在进行更新");
			form.submit({
				url: '<%=basePath %>user!Updatedata',
				waitMag: "正在进行更新 ,请稍候...",
				success: function(form, action) {
					alert("成功");
				},
				failure: function(from, action) {
					alert("失败");
				}
			});
		} else {
			console.info("正在进行添加");
			form.submit({
				url: '<%=basePath %>user!Insertdata',
				waitMag: "正在进行添加 ,请稍候...",
				success: function(form, action) {
					showDisplay("操作成功");
					userWindowPanel.close();
				},
				failure: function(from, action) {
					showDisplay("操作失败,请重新进行");
				}
			});

		}
	}
}