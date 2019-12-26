Ext.onReady(function() {
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
		fields: ['name', 'email', 'phone'],
		data: {
			'items': [{
					'name': 'Lisa',
					"email": "lisa@simpsons.com",
					"phone": "555-111-1224"
				},
				{
					'name': 'Bart',
					"email": "bart@simpsons.com",
					"phone": "555-222-1234"
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

	var listView = Ext.create('Ext.grid.Panel', {
		store: Ext.data.StoreManager.lookup('simpsonsStore'),
		columns: [{
				text: '(栏号)',
				dataIndex: 'name'
			},
			{
				text: '物料编号',
				dataIndex: 'email',
				//flex: 1
			},
			{
				text: '(物料名称)',
				dataIndex: 'phone'
			},
			{
				text: '(规格型号)',
				dataIndex: 'x'
			},
			{
				text: '(单位名称)',
				dataIndex: 'xx'
			},
			{
				text: '数量',
				dataIndex: 'xxx'
			},
			{
				text: '折扣前单价',
				dataIndex: 'xxxx'
			},
			{
				text: '折数(%)',
				dataIndex: 'xxxxx'
			},
			{
				text: '单价',
				dataIndex: 'xxxxxx'
			},
			{
				text: '金额',
				dataIndex: 'xxxxxxx'
			},
			{
				text: '税率(%)',
				dataIndex: 'xxxxx'
			},
			{
				text: '(税额)',
				dataIndex: 'xxxxxx'
			},
			{
				text: '(含税金额)',
				dataIndex: 'xxxxxxx'
			},
			{
				text: '(批号)',
				dataIndex: 'xxxxxxxx'
			},
			{
				text: '赠品',
				dataIndex: 'xxxxxxxxx'
			},
			{
				text: '(发票明细)',
				dataIndex: 'xxxxxxxxx'
			},
			{
				text: '(未开票金额)',
				dataIndex: 'xxxxxxxxxx'
			},
			{
				text: '分录备注',
				dataIndex: 'xxxxxxxxxxx'
			}
		],
		heigh: 135,
		width: 700,
		//renderTo: Ext.getBody()
	});

	// 创建 from.Panel 面板,然后内嵌到 Window 面板中
	var formControl = Ext.create('Ext.form.Panel', {
		border: false,
		fieldDefaults: {
			msgTarget: "side", // 错误提示信息在右旁边显示图标
			labelWidth: 79,
			labelAlign: "right",
			margin: 1
		},
		//	defaultType : 'textfield',
		layout: "anchor",
		items: [{
				xtype: "container",
				layout: 'hbox',
				margin: 5,
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
				margin: 5,
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
				margin: 5,
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
				margin: 5,
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
				margin: 5,
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
				margin: 5,
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
				height: 135,
				margin: 5,
				defaults: {
					bodyStyle: 'padding:2px'
				},
				items: [{
					title: '内容',
					defaults: {
						width: 230
					},
					defaultType: 'textfield',
					items: listView,
				}, {
					title: '帐款',
					defaults: {
						width: 230
					},
					defaultType: 'textfield',
					items: [{
						fieldLabel: 'Home',
						name: 'home',
						value: '(888) 555-1212'
					}, {
						fieldLabel: 'Business',
						name: 'business'
					}, {
						fieldLabel: 'Mobile',
						name: 'mobile'
					}, {
						fieldLabel: 'Fax',
						name: 'fax'
					}]
				}, {
					cls: 'x-plain',
					title: '备注',
					layout: 'fit',
					items: {
						xtype: 'htmleditor',
						name: 'bio2',
						fieldLabel: 'Biography'
					}
				}]
			},
			{
				xtype: "container",
				layout: 'hbox',
				margin: 5,
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
				margin: 5,
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
				margin: 5,
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

	//创建活动的Window窗体
	var win = Ext.create('Ext.window.Window', {
		id: "myWin",
		title: "采购入库单",
		width: 700,
		height: 500,
		layout: 'fit',
		modal: true,
		closable: true, // Extjs Window可以配置是否显示关闭按钮：
		closeAction: 'hide', // 在关闭Extjs Window的时候，通过配置项closeAction可以控制按钮是销毁（destroy）还是隐藏（hide），默认情况下为销毁：
		maximizable: true, // 最大化按钮
		minimizable: true, // 最小化按钮 
		items: formControl,
		//anchor:"100% 100%",
		buttons: [{
				xtype: 'button',
				text: "确定",
				handler: showValue
			},
			{
				xtype: 'button',
				text: "验证",
				handler: onUserSaveClick
			}
		],
		listeners: {
			// 最小化
			minimize: function(win, opts) {
				win.collapse();
			}

		}
	}).show();

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
		/*
		name
		age
		address
		dateLibary
		dateReg
		color
		check1
		check2
		check3
		cmjiguan
		remark
		*/
	}
});