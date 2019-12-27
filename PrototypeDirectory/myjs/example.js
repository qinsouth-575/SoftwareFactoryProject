Ext.onReady(function() {
	/*						*
	// 创建一个按钮
	Ext.create('Ext.button.Button', {
		text: "弹出窗口",
		id: "btnShow",
		name: "btnShow",
		renderTo: Ext.getBody(),
		handler: show
	})

	var comboxCZFStates = Ext.create('Ext.data.Store', {
		fields: ['value', 'text'],
		data: [{
				"value": "=",
				"text": "等于"
			},
			{
				"value": ">",
				"text": "大于"
			},
			{
				"value": "<",
				"text": "小于"
			},
			{
				"value": ">=",
				"text": "大于等于"
			},
			{
				"value": "<=",
				"text": "小于等于"
			},
			{
				"value": "like",
				"text": "like"
			},
		]
	});

	// 创建一个 form 面板,里面放一些控件
	var AddForm = Ext.create('Ext.form.Panel', {
		border: false,
		fieldDefaults: {
			msgTarget: "side", // 提示信息在右旁边显示图标
			labelWidth: 70,
			align: "right",
			allowBlank: false // 不允许为空
		},
		width: 280,
		defaults: {
			padding: 10
		},
		layout: 'column',
		items: [{
				xtype: 'hidden',
				name: "quId"
			},
			{
				xtype: 'numberfield',
				fieldLabel: "第几题",
				name: 'sorts',
				regex: /^\d+$/, // 正则验证
				maxLength: 100,
				columnWidth: 1
			},
			{
				xtype: 'combo',
				fieldLabel: "皮肤分类",
				name: 'claId',
				id: 'claId',
				valueField: 'value',
				displayField: 'text',
				columnWidth: 1, // 列布局占的比例,总值为1 
				allowBlank: false,
				store: comboxCZFStates,
				emptyText: "请选择皮肤分类",
				blankText: "请选择皮肤分类"
			},
			{
				xtype: "filefield",
				fieldLabel: "上传图片",
				buttonText: ' 选择 ',
				regex: /^.+\.((jpg)|(gif)|(gif)|(png)|(jpeg)|(bmp))$/, //正则验证
				name: 'queImg',
				allowBlank: true,
				columnWidth: 1
			},
			{
				xtype: 'textareafield',
				grow: true,
				fieldLabel: "问题",
				name: 'question',
				columnWidth: 1
			}
		]
	});

	// 创建一个Windows面板
	var AddDialog = Ext.create('Ext.window.Window', {
		title: '人员信息维护',
		layout: 'fit',
		iconCls: 'a_add',
		closeAction: 'hide', // 窗口关闭的方式 : hide / close
		resizable: true, // 是否可以拉伸
		closable: true, // 是否可以关闭
		modal: true, // 是否为模态窗口
		items: AddForm,
		buttonAlign: 'center',
		buttons: [{
				id: 'btnAdd',
				text: "添加",
				iconCls: 'a_add',
				handler: Add
			},
			{
				id: 'btnCancel',
				iconCls: 'a_cross',
				text: "重置",
				handler: function() {
					AddForm.form.reset();
				}
			},
			{
				id: 'btnClose',
				iconCls: 'a_add',
				text: "关闭",
				handler: function() {
					AddDialog.close();
				}
			}
		]
	});

	// 添加问题
	function Add() {
		var form = AddForm.getForm();
		if(form.isValid()) {
			form.submit({
				url: "/question/Add",
				params: {
					json: Ext.JSON.encode(AddForm.form.getValues()),
				},
				waitMag: "正在上传请稍候...",
				success: function(form, action) {
					Ext.Msg.alert("提示", action.result.msg);
					comboxCZFStates.load();
				}
			});
		}
	};

	function show() {
		//	Ext.Msg.alert("提示","你好!");
		AddDialog.show();
	} //						*/

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*				*
	// 创建动态Tree 的数据集 Store
	var dataTreeStore = Ext.create('Ext.data.TreeStore', {
		autoLoad: true, // 是否自动加载
		root: {
			id: "0",
			text: "导航菜单",
			expanded: true
		},
		// 设置 AJAX 
		proxy: {
			type: 'ajax',
			url: '<%=basePath %>tree!GetTreeDate', // Action 请求
			reader: {
				type: 'json',
				root: 'rows' // 返回的JSON的头
			},
			// 传参
			extraParams: {
				tid: ''
			}
		},
		listeners: { // 开启监听事件
			'beforeexpand': function(node, eOpts) {
				//点击父亲节点的菜单会将节点的id通过ajax请求，将到后台  
				//	console.info(node);
				this.proxy.extraParams.tid = node.raw.id;
			}
		}
	});

	//左边功能树   
	var menuTree = new Ext.tree.Panel({
		region: 'west',
		title: '功能菜单',
		width: 180,
		minSize: 150,
		maxSize: 200,
		split: true,
		autoScroll: true,
		autoHeight: false,
		collapsible: true,
		rootVisable: true, //不显示根节点   
		store: dataTreeStore,
		listeners: {
			itemclick: function(view, record, item, index, e, eOpts) {
				e.stopEvent();
				var newtab = contentPanel.getComponent(record.get('id'));
				console.info(record);
				if(!newtab && record.get('leaf')) { //判断是否已经打开该面板   
					newtab = contentPanel.add({
						'id': record.get('id'),
						'title': record.get('text'),
						closable: true, //通过html载入目标页   
						html: '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src="<%=basePath %>' + record.raw.url + '"></iframe>'
					});

				};
				contentPanel.setActiveTab(newtab);
			}
		}
	});

	/*
	//添加第一个节点(html)   
	menuTree.root.appendChild(new  Ext.tree.TreeNode({  
	  id:'htmlPanel' ,  
	  text:'通过html打开' ,  
	  listeners:{  
	      'click' : function (node, event) {  
	          event.stopEvent();  
	          var  n = contentPanel.getComponent(node.id);  
	          if  (!n) {  //判断是否已经打开该面板   
	              n = contentPanel.add({  
	                  'id' :node.id,  
	                  'title' :node.text,  
	                  closable:true ,   //通过html载入目标页   
	                  html:'<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src="iframe.html"></iframe>'   
	              });  
	          }  
	          contentPanel.setActiveTab(n);  
	      }  
	  }  
	}));  

	//添加第二个节点(autoLoad)   
	menuTree.root.appendChild(new  Ext.tree.TreeNode({  
	  id:'autoLoadPanel' ,  
	  text:'通过autoLoad打开' ,  
	  listeners:{  
	      'click' : function (node, event) {  
	          event.stopEvent();  
	          var  n = contentPanel.getComponent(node.id);  
	          if  (!n) {  ////判断是否已经打开该面板   
	              n = contentPanel.add({  
	                  'id' :node.id,  
	                  'title' :node.text,  
	                  closable:true ,  
	                  autoLoad:{url:'auto.php' , scripts: true }  //通过autoLoad属性载入目标页,如果要用到脚本,必须加上scripts属性   
	              });  
	          }  
	          contentPanel.setActiveTab(n);  
	      }  
	  }  
	}));  

	//添加第三个节点(function)   
	menuTree.root.appendChild(new  Ext.tree.TreeNode({  
	  id:'functionPanel' ,  
	  text:'通过函数打开' ,  
	  listeners:{  
	      'click' : function (node, event) {  
	          event.stopEvent();  
	          var  n = contentPanel.getComponent(node.id);  
	          if  (!n) {  
	              var  p =  new  fnPanel();  
	              p.id = node.id;  
	              p.title = node.text;  
	              n = contentPanel.add(p);  
	          }  
	          contentPanel.setActiveTab(n);  
	      }  
	  }  
	}));  
	*
	
	//通过扩展来构建要创建的面板   
	fnPanel = Ext.extend(Ext.Panel, {
		closable: true,
		autoScroll: true,
		layout: 'fit', //如果用函数来创建该面板的话,布局必须设置为fit,否则不会显示该面板中的内容   

		//创建面板内容   
		createFormPanel: function() {
			return new Ext.form.FormPanel({
				buttonAlign: 'center',
				labelAlign: 'right',
				frame: false,
				bodyBorder: false,
				bodyStyle: 'padding:25px',
				items: [{
					xtype: 'textfield',
					fieldLabel: '用户名',
					width: 350,
					name: 'username'
				}, {
					xtype: 'textfield',
					fieldLabel: '密　码',
					width: 350,
					name: 'password'
				}],
				buttons: [{
					text: '登陆'
				}, {
					text: '取消'
				}]
			});
		},

		//重装控件初始化函数,在该函数中完成面板中内容的初始化   
		initComponent: function() {
			fnPanel.superclass.initComponent.call(this);
			this.fp = this.createFormPanel();
			this.add(this.fp);
		}
	});

	//中间具体功能面板区   
	var contentPanel = new Ext.TabPanel({
		region: 'center',
		enableTabScroll: true,
		activeTab: 0,
		frame: true,
		items: [{
			id: 'homePage',
			title: '首页1',
			autoScroll: true,
			html: '<div style="position:absolute;color:#ff0000;top:40%;left:40%;">说明文档1</div>'
		}]
	});

	// 设置顶部面板
	var north = new Ext.Panel({
		frame: true,
		plain: true,
		height: 50,
		region: 'north',
		items: [{
			baseCls: "x-plain",
			border: false,
			height: 29,
			html: "<font style='font-size:24px'>中国航空结算系统</font>"
		}]
	});

	Ext.onReady(function() {
		new Ext.Viewport({
			layout: 'border', //使用border布局   
			defaults: {
				activeItem: 0
			},
			items: [menuTree, contentPanel, north]
		});
	}); //			*/

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*				*
	//1.定义Model
	Ext.define("MyApp.model.User", {
		extend: "Ext.data.Model",
		fields: [{
				name: 'name',
				type: 'string'
			},
			{
				name: 'age',
				type: 'int'
			},
			{
				name: 'phone',
				type: 'string'
			}
		]
	});

	//2.创建store
	var store = Ext.create("Ext.data.Store", {
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

	//3.创建grid
	var viewport = Ext.create("Ext.container.Viewport", {
		layout: "fit",
		items: {
			xtype: "grid",
			model: "MyApp.model.User",
			store: store,
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
	});

	//4.添加双击编辑
	var grid = viewport.down("grid");
	grid.on("itemdblclick", function(me, record, item, index, e, eopts) {
		//5.创建编辑表单
		var win = Ext.create("Ext.window.Window", {
			title: "编辑用户",
			width: 300,
			height: 200,
			layout: "fit",
			items: {
				xtype: "form",
				margin: 5,
				border: false,
				fieldDefaults: {
					labelAlign: 'left',
					labelWidth: 60
				},
				items: [{
						xtype: "textfield",
						name: "name",
						fieldLabel: "姓名"
					},
					{
						xtype: "numberfield",
						name: "age",
						fieldLabel: "年龄"
					},
					{
						xtype: "textfield",
						name: "phone",
						fieldLabel: "电话"
					}
				]
			},
			buttons: [{
				text: "保存",
				handler: function() {
					win.down("form").updateRecord();
					record.commit();
					win.close();
				}
			}]
		});
		win.down("form").loadRecord(record);
		win.show();
	}); //			*/

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*					*
	var tdata = {
		id: 1,
		text: '根节点',
		expanded: true,
		children: [{
				id: 2,
				text: '叶子节点1',
				leaf: "1"
			},
			{
				id: 3,
				text: '叶子节点2',
				leaf: "0"
			},
			{
				id: 4,
				text: '节点3',
				expanded: true,
				children: [{
					id: 5,
					text: '节点3-1111',
					expanded: true,
					leaf: "1"

				}]

			}
		]
	};

	// 创建一个Tree的数据集
	var tStore = Ext.create('Ext.data.TreeStore', {
		root: tdata
	});

	// 创建一个 Tree 面板
	var t1Panel = Ext.create('Ext.tree.Panel', {
		renderTo: Ext.getBody(),
		title: "简单的一棵树",
		//  width: 450,
		rootVisible: true, // 是否显示根节点
		useArrows: true, // 将节点前的 + 号 显示为一个箭头图标
		lines: true, // 是否显示折叠线
		store: tStore,
		listeners: {
			itemclick: function(view, record, item, index, e, eOpts) {
				e.stopEvent();
				var newtab = contentPanel.getComponent(record.get('id'));
				if(!newtab && record.get('leaf')) { //判断是否已经打开该面板   
					newtab = contentPanel.add({
						'id': record.get('id'),
						'title': record.get('text'),
						closable: true, //通过html载入目标页   
						html: '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src="' + record.get('href') + '"></iframe>'
					});

				};
				contentPanel.setActiveTab(newtab);
			}
		}
	});

	// 添加按钮
	Ext.create('Ext.button.Button', {
		id: 'btnAdd',
		name: 'btnAdd',
		text: "添加节点",
		handler: addNode,
		renderTo: Ext.getBody()
	});

	Ext.create('Ext.button.Button', {
		id: 'btnDelete',
		name: 'btnDelete',
		text: "删除节点",
		handler: deleteNode,
		renderTo: Ext.getBody()
	});

	function addNode() {
		var nodes = t1Panel.getSelectionModel().getSelection();
		Ext.each(nodes, function(node) {
			//先通过ajax从后台删除数据，删除成功后再从页面删除数据
			//	console.info(node.get("text") + "---,节点类型: " + node.get("leaf")  + "---,节点类型: " + node.isLeaf( ) + ",节点ID: " + node.get("id"));
			var parent = node.appendChild({
				text: 'Parent 1'
			});

			parent.appendChild({
				text: 'Child 3',
				leaf: true
			});

			parent.expand();
		})

		var nodecount = t1Panel.getSelectionModel().getCount();
		//	console.info(nodecount);
	};

	function deleteNode() {
		var nodes = t1Panel.getSelectionModel().getSelection();
		Ext.each(nodes, function(node) {
			// node.removeAll();			// 删除选中节点下的子节点
			node.remove(); // 删除选中节点及其子节点
		})
	};

	//==============================================下面是一个Tree表格

	var t2data = {
		name: 'Root',
		description: '根节点是这么描述的',
		expanded: true,
		children: [{
				name: "叶子节点1",
				description: "叶子节点1的描述",
				leaf: true
			},
			{
				name: "叶子节点2",
				description: "叶子节点2的描述",
				leaf: true
			},
			{
				name: "子节点3",
				description: "子节点3的描述",
				expanded: true,
				children: [{
					name: "叶子节点3",
					description: "叶子节点3的描述",
					leaf: true
				}]
			}
		]
	};

	var t2Store = Ext.create('Ext.data.TreeStore', {
		fields: ['name', 'description'],
		root: t2data,

	});

	Ext.create('Ext.tree.Panel', {
		renderTo: Ext.getBody(),
		title: '一颗拥有多列的树',
		rootVisible: true, // 是否显示根节点
		columns: [{
			xtype: 'treecolumn',
			text: '节点名',
			dataIndex: 'name',
			width: 150,
			sortable: true
		}, {
			text: '描述',
			dataIndex: 'description',
			flex: 1,
			sortable: true
		}],
		store: t2Store
	});

	// ==================开始创建动态加载Tree

	// 创建动态Tree 的数据集 Store
	var datatStore = Ext.create('Ext.data.TreeStore', {
		autoLoad: true, // 是否自动加载
		root: {
			id: "0",
			text: "导航菜单",
			expanded: true
		},
		// 设置 AJAX 
		proxy: {
			type: 'ajax',
			url: '<%=basePath %>tree!GetTreeDate', // Action 请求
			reader: {
				type: 'json',
				root: 'rows' // 返回的JSON的头
			},
			// 传参
			extraParams: {
				tid: ''
			}
		},
		listeners: { // 开启监听事件
			'beforeexpand': function(node, eOpts) {
				//点击父亲节点的菜单会将节点的id通过ajax请求，将到后台  
				console.info(node);
				this.proxy.extraParams.tid = node.raw.id;
			}
		}
	});

	// 添加按钮
	Ext.create('Ext.button.Button', {
		id: 'btnAdd',
		name: 'btnAdd',
		text: "查看节点信息",
		handler: dataNode,
		renderTo: Ext.getBody()
	});

	function dataNode() {
		var nodes = dataTree.getSelectionModel().getSelection();
		Ext.each(nodes, function(node) {
			//先通过ajax从后台删除数据，删除成功后再从页面删除数据
			console.info(node);
			//	console.info(node.get("text") + "---,节点类型: " + node.get("leaf")  + "---,节点类型: " + node.isLeaf( ) + ",节点ID: " + node.get("id"));

		})

		var nodecount = dataTree.getSelectionModel().getCount();
		console.info(nodecount);
	};

	// 先创建一棵Tree
	var dataTree = Ext.create('Ext.tree.Panel', {
		renderTo: Ext.getBody(),
		title: "动态加载TreePanel",
		width: 300,
		height: 400,
		rootVisible: true, // 是否显示根节点
		useArrows: true, // 将节点前的 + 号 显示为一个箭头图标
		lines: true, // 是否显示折叠线
		store: datatStore
	}); //		*/

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*				*
	Ext.QuickTips.init();

	var form = new Ext.form.FormPanel({
		buttonAlign: 'center',
		width: 600,
		title: 'form布局',
		frame: true,
		fieldDefaults: {
			labelAlign: 'right',
			labelWidth: 30
		},
		items: [{
				xtype: 'container',
				layout: 'column', // 使用列布局,分成两列
				items: [{
						columnWidth: 0.7,
						xtype: 'fieldset',
						collapsible: true, // 是否可以折叠
						collapsed: false, // 默认是否折叠
						title: "单纯输入",
						autoHeight: true,
						defaults: {
							width: 300
						},
						defaultType: 'textfield',
						layout: 'form',
						items: [{
								xtype: 'container',
								layout: 'hbox',
								margin: 5,
								items: [{
										xtype: 'textfield',
										fieldLabel: "票面货币",
										id: 'zfdAddWin_piaomianhuobi',
										name: 'zfdAddWin_piaomianhuobi',
										width: 200,
										labelWidth: 60
									},
									{
										xtype: 'textfield',
										fieldLabel: '票款',
										id: 'zfdAddWin_pmhbpiaokuan',
										name: 'zfdAddWin_pmhbpiaokuan',
										width: 300,
										labelWidth: 30
									},
								]

							},
							{
								xtype: 'combo',
								fieldLabel: "选择",
								name: 'combo',
								store: new Ext.data.Store({
									fields: ['value', 'text'],
									data: [{
											'value': "value1",
											'text': "text1"
										},
										{
											'value': "value2",
											'text': "text2"
										}
									]
								}),
								displayField: 'text',
								valueFiled: 'value',
								mode: 'local',
								emptyText: "请选择"
							},
							{
								xtype: 'datefield',
								fieldLabel: "日期",
								name: 'date'
							},
							{
								xtype: 'timefield',
								fieldLabel: "时间",
								name: 'time'
							},
							{
								xtype: 'textarea',
								fieldLabel: "多行",
								name: 'textarea',

								// 	xtype: 'textarea',
								//	name: 'remark',
								//	id : 'remark',
								//	fieldLabel: "备注", 
								//	 width: '100%',
							},
							{
								xtype: 'hidden',
								name: 'hidden'
							}
						]
					},
					// 第二列的内容
					{
						xtype: 'container',
						columnWidth: 0.3,
						layout: 'form',
						items: [{
								xtype: 'fieldset',
								checkboxTaggle: true, // 多选
								title: "多选",
								autoHeight: true,
								defaultType: 'checkbox',
								hideLabels: true,
								style: 'margin-left : 10px;',
								bodyStyle: 'margin-left : 20px;',
								items: [{
										boxLabel: "首先要穿暖",
										name: 'check',
										value: '1',
										checked: true,
										width: 'auto'
									},
									{
										boxLabel: "然后要吃饱",
										name: 'check',
										value: '2',
										checked: true,
										width: 'auto'
									},
									{
										boxLabel: "房子遮风避雨",
										name: 'check',
										value: '3',
										width: 'auto'
									},
									{
										boxLabel: "交通方便",
										name: 'check',
										value: '4',
										width: 'auto'
									}
								]
							},
							// 第二列第二行单选框
							{
								xtype: 'fieldset',
								checkboxToggle: true,
								title: '单选',
								autoHeight: true,
								defaultType: 'radio',
								hideLabels: true,
								style: 'margin-left: 10px;',
								bodyStyle: 'margin-left: 20px;',
								items: [{
										boxLabel: "渴望自由",
										name: 'rad',
										value: '1',
										checked: true,
										width: 'auto'
									},
									{
										boxLabel: "祈求爱情",
										name: 'rad',
										value: '2',
										//	checked : true,
										width: 'auto'
									},
									{
										boxLabel: "金钱多多",
										name: 'rad',
										value: '3',
										//	checked : true,
										width: 'auto'
									}
								]
							}
						]
					}
				]
			},
			{
				xtype: 'container',
				layout: 'form',
				items: [{
					labelAlign: 'top',
					xtype: 'htmleditor',
					fieldLabel: '在线编辑器',
					id: 'editor',
					anchor: '98%',
					height: 200
				}]
			}
		],
		buttons: [{
				text: "保存"
			},
			{
				text: "读取"
			},
			{
				text: "取消"
			}
		]
	});

	form.render("form"); //		*/

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*				*
	// 籍贯下拉列表中的值
	var jiguandata = [{
			'text': '安徽',
			"value": "anhui"
		},
		{
			'text': '新疆',
			"value": "xinjiang"
		},
		{
			'text': '广东',
			"value": "guangdong"
		},
		{
			'text': '北京',
			"value": "beijing"
		}
	];

	// 籍贯的Store对象 
	var jiguanStore = Ext.create('Ext.data.Store', {
		fields: ['text', 'value'],
		data: jiguandata
	});

	// 创建 from.Panel 面板,然后内嵌到 Window 面板中
	var formControl = Ext.create('Ext.form.Panel', {
		border: false,
		fieldDefaults: {
			msgTarget: "side", // 错误提示信息在右旁边显示图标
			labelWidth: 60,
			labelAlign: "right",
			margin: 2
		},
		//	defaultType : 'textfield',
		layout: "anchor",
		items: [{
				xtype: "container",
				layout: 'hbox',
				margin: 5,
				items: [{
						xtype: 'textfield',
						name: 'name',
						id: 'name',
						fieldLabel: "姓名",
						width: '50%',
						labelSeParator: "<font color ='red'> *</font>:",
						allowBlank: false
					},
					{
						xtype: 'numberfield',
						name: 'age',
						id: 'age',
						fieldLabel: "年龄",
						decimalPrecision: 0,
						//	vtype: 'age',
						//	regex : /^\d+$,
						//	regexText: '请输入正确的编码格式',
						minValue: 10,
						labelSeparator: "<font color ='red'>*</font>:",
						value: 10,
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
						name: 'address',
						id: 'address',
						fieldLabel: "家庭住址",
						allowBlank: false,
						width: '50%',
					},
					{
						xtype: 'datefield',
						name: 'dateLibary',
						id: 'dateLibary',
						fieldLabel: "出生日期",
						format: 'Y-m-d',
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
						xtype: 'timefield',
						name: 'dateReg',
						id: 'dateReg',
						fieldLabel: "注册时间",
						allowBlank: false,
						format: 'H:i:s',
						increment: 5, //时间颗粒度 
						emptyText: '请选择',
						width: '50%',
					},
					{
						xtype: 'radiogroup', // fieldcontainer
						id: 'color',
						fieldLabel: '性别',
						labelSeparator: "<font color ='red'> *</font>:",
						//  defaultType: 'radio',  
						width: '50%',
						defaults: {
							flex: 1
						},
						layout: 'hbox',
						items: [{
								boxLabel: '男',
								name: 'color',
								inputValue: '1',
								//     id        : 'radio1',
								checked: true,
							},
							{
								boxLabel: '女',
								name: 'color',
								inputValue: '0',
								//     id        : 'radio2'  ,
							}

						]
					}
				]
			},
			{
				// 复选框
				xtype: "container",
				layout: 'hbox',
				margin: 5,
				items: [{
						xtype: 'fieldcontainer', // fieldcontainer
						fieldLabel: '爱好',
						defaultType: 'checkboxfield', // checkbox
						defaults: {
							flex: 1
						},
						layout: 'hbox',
						width: '50%',
						items: [{
								boxLabel: '看书',
								name: 'check1',
								inputValue: '1',
								id: 'check1',
								checked: true
							},
							{
								boxLabel: '游泳',
								name: 'check2',
								inputValue: '2',
								id: 'check2'
							},
							{
								boxLabel: "啪啪",
								name: 'check3',
								inputValue: '3',
								id: 'check3'
							}
						]
					},
					{
						// 下拉列表
						xtype: 'combobox',
						name: 'cmjiguan',
						id: 'cmjiguan',
						fieldLabel: "籍贯",
						store: jiguanStore,
						queryMode: 'local',
						displayField: 'text',
						valueField: 'value',
						emptyText: '请选择',
						blankText: '请选择籍贯',
						width: '50%',
					}
				]
			},
			{
				xtype: 'container',
				margin: 5,
				layout: 'vbox',
				anchor: "100%",
				items: [{
					xtype: 'textarea',
					name: 'remark',
					id: 'remark',
					fieldLabel: "备注",
					width: '100%',
					//	flex: 1
				}]
			}
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

	var win = Ext.create('Ext.window.Window', {
		id: "myWin",
		title: "示例窗口",
		width: 500,
		height: 300,
		layout: 'fit',
		modal: true,
		closable: false, // Extjs Window可以配置是否显示关闭按钮：
		closeAction: 'hide', // 在关闭Extjs Window的时候，通过配置项closeAction可以控制按钮是销毁（destroy）还是隐藏（hide），默认情况下为销毁：
		maximizable: true, // 最大化按钮
		minimizable: true, // 最小化按钮 
		items: formControl,
		// anchor:"100% 100%",
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
		var svalue = Ext.getCmp('name').getValue() + "---" +
			Ext.getCmp('age').getValue() + "---" +
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
	} //			*/

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*					*
	var states = Ext.create('Ext.data.Store', {
		fields: ['abbr', 'name'],
		data: [{
				"abbr": "AL",
				"name": "Alabama"
			},
			{
				"abbr": "AK",
				"name": "Alaska"
			},
			{
				"abbr": "AZ",
				"name": "Arizona"
			}
		]
	});

	Ext.create('Ext.form.ComboBox', {
		fieldLabel: 'Choose State',
		store: states,
		queryMode: 'local',
		valueField: 'abbr',
		renderTo: Ext.getBody(),
		// Template for the dropdown menu.
		// Note the use of "x-boundlist-item" class,
		// this is required to make the items selectable.
		tpl: Ext.create('Ext.XTemplate',
			'<tpl for=".">',
			'<div class="x-boundlist-item">{abbr} - {name}</div>',
			'</tpl>'
		),
		// template for the content inside text field
		displayTpl: Ext.create('Ext.XTemplate',
			'<tpl for=".">',
			'{abbr} - {name}',
			'</tpl>'
		)
	}); //				*/

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*				*
	Ext.create('Ext.container.Viewport', {
		layout: 'border',
		items: [{
			region: 'north',
			html: '<h1 class="x-panel-header">Page Title</h1>',
			border: false,
			margins: '0 0 5 0'
		}, {
			region: 'west',
			collapsible: true,
			title: 'Navigation',
			width: 150
			// could use a TreePanel or AccordionLayout for navigational items
		}, {
			region: 'south',
			title: 'South Panel',
			collapsible: true,
			html: 'Information goes here',
			split: true,
			height: 100,
			minHeight: 100
		}, {
			region: 'east',
			title: 'East Panel',
			collapsible: true,
			split: true,
			width: 150
		}, {
			region: 'center',
			xtype: 'tabpanel', // TabPanel itself has no title
			activeTab: 0, // First tab active by default
			items: {
				title: 'Default Tab',
				html: 'The first tab\'s content. Others may be added dynamically'
			}
		}]
	}); //			*/

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*				*
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
				},
				{
					'name': 'Homer',
					"email": "home@simpsons.com",
					"phone": "555-222-1244"
				},
				{
					'name': 'Marge',
					"email": "marge@simpsons.com",
					"phone": "555-222-1254"
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
				text: 'Name',
				dataIndex: 'name'
			},
			{
				text: 'Email',
				dataIndex: 'email',
				flex: 1
			},
			{
				text: 'Phone',
				dataIndex: 'phone'
			}
		],
		height: 200,
		width: 400,
		//renderTo: Ext.getBody()
	});

	var bd = Ext.getBody();

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*
	 * ================  Simple form  =======================
	 */
	/*						*
	bd.createChild({
		tag: 'h2',
		html: 'Form - Ext.grid.Panel'
	});

	listView.render(document.body);

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
	}); 	//			*/

	/*					*
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
	});				//			*/

	/*	  带滚动条的GridPanel		*
	Ext.define('Company', {
		extend: 'Ext.data.Model',
		fields: [{
				name: 'company'
			},
			{
				name: 'price',
				type: 'float'
			},
			{
				name: 'change',
				type: 'float'
			},
			{
				name: 'pctChange',
				type: 'float'
			},
			{
				name: 'lastChange',
				type: 'date',
				dateFormat: 'n/j h:ia'
			},
			{
				name: 'industry'
			},
			{
				name: 'desc'
			}
		]
	});
	// Array data for the grids
	Ext.grid.dummyData = [
		['3m Co', 71.72, 0.02, 0.03, '9/1 12:00am', 'Manufacturing'],
		['Alcoa Inc', 29.01, 0.42, 1.47, '9/1 12:00am', 'Manufacturing'],
		['Altria Group Inc', 83.81, 0.28, 0.34, '9/1 12:00am', 'Manufacturing'],
		['American Express Company', 52.55, 0.01, 0.02, '9/1 12:00am', 'Finance'],
		['American International Group, Inc.', 64.13, 0.31, 0.49, '9/1 12:00am', 'Services'],
		['AT&T Inc.', 31.61, -0.48, -1.54, '9/1 12:00am', 'Services'],
		['Boeing Co.', 75.43, 0.53, 0.71, '9/1 12:00am', 'Manufacturing'],
		['Caterpillar Inc.', 67.27, 0.92, 1.39, '9/1 12:00am', 'Services'],
		['Citigroup, Inc.', 49.37, 0.02, 0.04, '9/1 12:00am', 'Finance'],
		['E.I. du Pont de Nemours and Company', 40.48, 0.51, 1.28, '9/1 12:00am', 'Manufacturing'],
		['Exxon Mobil Corp', 68.1, -0.43, -0.64, '9/1 12:00am', 'Manufacturing'],
		['General Electric Company', 34.14, -0.08, -0.23, '9/1 12:00am', 'Manufacturing'],
		['General Motors Corporation', 30.27, 1.09, 3.74, '9/1 12:00am', 'Automotive'],
		['Hewlett-Packard Co.', 36.53, -0.03, -0.08, '9/1 12:00am', 'Computer'],
		['Honeywell Intl Inc', 38.77, 0.05, 0.13, '9/1 12:00am', 'Manufacturing'],
		['Intel Corporation', 19.88, 0.31, 1.58, '9/1 12:00am', 'Computer'],
		['International Business Machines', 81.41, 0.44, 0.54, '9/1 12:00am', 'Computer'],
		['Johnson & Johnson', 64.72, 0.06, 0.09, '9/1 12:00am', 'Medical'],
		['JP Morgan & Chase & Co', 45.73, 0.07, 0.15, '9/1 12:00am', 'Finance'],
		['McDonald\'s Corporation', 36.76, 0.86, 2.40, '9/1 12:00am', 'Food'],
		['Merck & Co., Inc.', 40.96, 0.41, 1.01, '9/1 12:00am', 'Medical'],
		['Microsoft Corporation', 25.84, 0.14, 0.54, '9/1 12:00am', 'Computer'],
		['Pfizer Inc', 27.96, 0.4, 1.45, '9/1 12:00am', 'Medical'],
		['The Coca-Cola Company', 45.07, 0.26, 0.58, '9/1 12:00am', 'Food'],
		['The Home Depot, Inc.', 34.64, 0.35, 1.02, '9/1 12:00am', 'Retail'],
		['The Procter & Gamble Company', 61.91, 0.01, 0.02, '9/1 12:00am', 'Manufacturing'],
		['United Technologies Corporation', 63.26, 0.55, 0.88, '9/1 12:00am', 'Computer'],
		['Verizon Communications', 35.57, 0.39, 1.11, '9/1 12:00am', 'Services'],
		['Wal-Mart Stores, Inc.', 45.45, 0.73, 1.63, '9/1 12:00am', 'Retail'],
		['Walt Disney Company (The) (Holding Company)', 29.89, 0.24, 0.81, '9/1 12:00am', 'Services']
	];

	// add in some dummy descriptions
	for(var i = 0; i < Ext.grid.dummyData.length; i++) {
		Ext.grid.dummyData[i].push('Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed metus nibh, sodales a, porta at, vulputate eget, dui. Pellentesque ut nisl. ');
	}

	Ext.QuickTips.init();

	var getLocalStore = function() {
		return Ext.create('Ext.data.ArrayStore', {
			model: 'Company',
			data: Ext.grid.dummyData
		});
	};

	////////////////////////////////////////////////////////////////////////////////////////
	// Grid 2
	////////////////////////////////////////////////////////////////////////////////////////
	var grid2 = Ext.create('Ext.grid.Panel', {
		id: 'grid2',
		store: getLocalStore(),
		selType: 'checkboxmodel',
		columns: [{
				text: "Company",
				width: 200,
				dataIndex: 'company'
			},
			{
				text: "Price",
				renderer: Ext.util.Format.usMoney,
				dataIndex: 'price'
			},
			{
				text: "Change",
				dataIndex: 'change'
			},
			{
				text: "% Change",
				dataIndex: 'pctChange'
			},
			{
				text: "Last Updated",
				width: 135,
				renderer: Ext.util.Format.dateRenderer('m/d/Y'),
				dataIndex: 'lastChange'
			}
		],
		columnLines: true,
		width: 600,
		height: 300,
		frame: true,
		title: 'Framed with Checkbox Selection and Horizontal Scrolling',
		iconCls: 'icon-grid',
		margin: '0 0 20 0',
		renderTo: Ext.getBody()
	});				//			*/
});