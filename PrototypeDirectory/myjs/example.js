Ext.onReady(function() {
	//2.创建store
	/*var store = Ext.create("Ext.data.Store", {
		model: "MyApp.model.User",
		data: [{
				name: "Tom",
				age: 5,
				phone: "123456"
			},
			{
				name: "Jerry",
				age: 3,
				phone: "654321"
			}
		]
	});

	var viewport = Ext.create("Ext.container.Viewport", {
		layout: "fit",
		items: {
			xtype: "grid",
			model: "MyApp.model.User",
			//store: store,
			columns: [{
					text: '姓名',
					dataIndex: 'name'
				},
				{
					text: '年龄',
					dataIndex: 'age',
					xtype: 'numbercolumn',
					format: '0'
				},
				{
					text: '电话',
					dataIndex: 'phone'
				}
			]
		}
	});*/
	
	
	
	
	
	
	
	
	//创建TabPanel组件，再内嵌到FormPanel
	var tab2 = Ext.create('Ext.form.Panel', {
		title: 'Inner Tabs',
		bodyStyle: 'padding:5px',
		width: 600,
		fieldDefaults: {
			labelAlign: 'top',
			msgTarget: 'side'
		},
		defaults: {
			anchor: '100%'
		},

		items: [{
			layout: 'column',
			border: false,
			items: [{
				columnWidth: .5,
				border: false,
				layout: 'anchor',
				defaultType: 'textfield',
				items: [{
					fieldLabel: 'First Name',
					name: 'first',
					anchor: '95%'
				}, {
					fieldLabel: 'Company',
					name: 'company',
					anchor: '95%'
				}]
			}, {
				columnWidth: .5,
				border: false,
				layout: 'anchor',
				defaultType: 'textfield',
				items: [{
					fieldLabel: 'Last Name',
					name: 'last',
					anchor: '95%'
				}, {
					fieldLabel: 'Email',
					name: 'email',
					vtype: 'email',
					anchor: '95%'
				}]
			}]
		}, {
			xtype: 'tabpanel',
			plain: true,
			activeTab: 0,
			height: 235,
			defaults: {
				bodyStyle: 'padding:10px'
			},
			items: [{
				title: 'Personal Details',
				defaults: {
					width: 230
				},
				defaultType: 'textfield',

				items: [{
					fieldLabel: 'First Name',
					name: 'first',
					allowBlank: false,
					value: 'Jamie'
				}, {
					fieldLabel: 'Last Name',
					name: 'last',
					value: 'Avins'
				}, {
					fieldLabel: 'Company',
					name: 'company',
					value: 'Ext JS'
				}, {
					fieldLabel: 'Email',
					name: 'email',
					vtype: 'email'
				}]
			}, {
				title: 'Phone Numbers',
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
				title: 'Biography',
				layout: 'fit',
				items: {
					xtype: 'htmleditor',
					name: 'bio2',
					fieldLabel: 'Biography'
				}
			}]
		}],

		buttons: [{
			text: 'Save'
		}, {
			text: 'Cancel'
		}]
	});

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});