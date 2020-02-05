// 3.调价单 ChangePriceBill

var grid_CPB = Ext.create('Ext.grid.Panel', {
	id: 'grid_CPB',
	store: Ext.data.StoreManager.lookup('simpsonsStore'),
	columnLines: true,
	border: 0, //边框
	width: 559, //长度
	height: 143, //高度
	frame: false, //true：有边框；false：无边框
	//iconCls: 'icon-grid',	//标题栏，下面这个是标题内容
	//title: 'Framed with Checkbox Selection and Horizontal Scrolling',
	margin: '0 0 0 0', //外边距
	//renderTo: Ext.getBody(),
	features: [{
		ftype: 'groupingsummary',
		id: 'group_CPB',
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
var formControl_CPB = Ext.create('Ext.form.Panel', {
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
					xtype: 'datefield',
					name: 'documentDate_CPB',
					id: 'documentDate_CPB',
					fieldLabel: "单据日期",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
					format: 'Y-m-d',
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'documentNumber_CPB',
					id: 'documentNumber_CPB',
					fieldLabel: "单据号码",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
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
					name: 'supplierAddress_CPB',
					id: 'supplierAddress_CPB',
					fieldLabel: "增值科目",
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'supplier_CPB',
					id: 'supplier_CPB',
					fieldLabel: "凭证编号",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false, //设置必填项		验证并提示错误信息
					width: '50%',
				},
			]
		},
		{
			xtype: "container",
			layout: 'hbox',
			margin: 2,
			items: [{
					xtype: 'datefield',
					name: 'effectiveDate_CPB',
					id: 'effectiveDate_CPB',
					fieldLabel: "减值科目",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
					format: 'Y-m-d',
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'currency_CPB',
					id: 'currency_CPB',
					fieldLabel: "调整方式",
					labelSeparator: "<font color ='red'>*</font>:",
					allowBlank: false,
					width: '50%',
				},
			]
		},
		{
			xtype: 'tabpanel',
			plain: true,
			activeTab: 0,
			height: 167,
			margin: '0 3 0 3',			//设置四面外边距，可负数
			defaults: {
				bodyStyle: 'padding:0px'
			},
			items: [{
				title: '内容',
				defaults: {
					width: 230				//此属性无用
				},
				defaultType: 'textfield',
				items: grid_CPB,			//Tab1 列表
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
					name: 'bio2_CPB',
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
					name: 'makingPersonnel_CPB',
					id: 'makingPersonnel_CPB',
					fieldLabel: "制单人员",
					width: '50%',
				},
				{
					xtype: 'textfield',
					name: 'reviewingOfficer_CPB',
					id: 'reviewingOfficer_CPB',
					fieldLabel: "复核人员",
					width: '50%',
				},
			]
		},
	]
});

//创建活动的Window窗体
var ChangePriceBill = Ext.create('Ext.window.Window', {
	id: "ChangePriceBill",
	title: "调价单",
	width: 579,
	height: 413,
	layout: 'fit',
 	//autoScroll: false,	// 容器过高或者过宽时，窗体自动显示滚动条 - 无效
    modal: false,
	closable: true, 	// Extjs Window可以配置是否显示关闭按钮：
	closeAction: 'hide',// 在关闭Extjs Window的时候，通过配置项closeAction可以控制按钮是销毁（destroy）还是隐藏（hide），默认情况下为销毁：
	maximizable: true, 	// 最大化按钮
	minimizable: true, 	// 最小化按钮;需重写minimize()函数;
	constrain: true,	// 保证整个窗口不会越过浏览器的边界;
	resizable: false,   // 窗口可拖动改变大小;
	items: formControl_CPB,
	//anchor:"100% 100%",
	buttons: [{
			xtype: 'button',
			text: "新增",
			handler: insertButton
		}, {
			xtype: 'button',
			text: "删除",
			handler: deleteButton
		}, {
			xtype: 'button',
			text: "修改",
			handler: function(){
				alert("修改按钮");
			}
		}, {
			xtype: 'button',
			text: "保存",
			handler: function(){
				alert("保存按钮");
			}
		}, {
			xtype: 'button',
			text: "审核",
			handler: function(){
				alert("审核按钮");
			}
		}, {
			xtype: 'button',
			text: "刷新",
			handler: function(){
				alert("刷新按钮");
			}
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