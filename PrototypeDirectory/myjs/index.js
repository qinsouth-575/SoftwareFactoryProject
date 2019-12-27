Ext.onReady(function() {
	// 创建一个按钮
	var indexMenuButton1 = Ext.create('Ext.button.Button', {
		text: "打开采购入库单",
		id: "btn1Show",
		name: "btn1Show",
		width : 99,
		height : 50,
		margin : 5,
		//renderTo: Ext.getBody(),
		handler: function() {
            PurchaseEnterWarehouse.show();
        }
	});
	
	var indexMenuButton2 = Ext.create('Ext.button.Button', {
		text: "关闭采购入库单",
		id: "btn2Show",
		name: "btn2Show",
		width : 99,
		height : 50,
		margin : 5,
		//renderTo: Ext.getBody(),
		handler: function() {
            PurchaseEnterWarehouse.close();
        }
	});
	
	var indexMenuControl = Ext.create('Ext.form.Panel', {
        border: false,
		fieldDefaults: {
			msgTarget: "side", // 错误提示信息在右旁边显示图标
			labelWidth: 79,
			labelAlign: "right",
			margin: 1
		},
		//	defaultType : 'textfield',
		layout: "anchor",
		items: [
			indexMenuButton1,
			indexMenuButton2,
			grid2,
			//grid,
		]
    });
    
    //创建活动的Window窗体
	var win = Ext.create('Ext.window.Window', {
		id: "indexWin",
		title: "竹林流沙进销存系统 - 图形选单 - 主菜单",
		width: 777,
		height: 555,
     	layout: 'fit',		// 弹出窗口内布局会充满整个窗口;
    	modal: false,		// 是否为模式化窗体
		closable: true, 	// Extjs Window可以配置是否显示关闭按钮：
		closeAction: 'hide',// 在关闭Extjs Window的时候，通过配置项closeAction可以控制按钮是销毁（destroy）还是隐藏（hide），默认情况下为销毁：
		maximizable: true, 	// 最大化按钮
		minimizable: true, 	// 最小化按钮
		resizable:true,     // 窗口可拖动改变大小;
		items: indexMenuControl,
		//anchor:"100% 100%",
		/*buttons: [{
				xtype: 'button',
				text: "确定",
				//handler: showValue
			},
			{
				xtype: 'button',
				text: "验证",
				//handler: onUserSaveClick
			}
		],*/
		listeners: {
			// 最小化
			minimize: function(win, opts) {
				win.collapse();
			}
		}
	}).show();
    
    //win.show();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Ext.define('Company', {
        extend: 'Ext.data.Model',
        fields: [
            {name: 'company'},
            {name: 'price', type: 'float'},
            {name: 'change', type: 'float'},
            {name: 'pctChange', type: 'float'},
            {name: 'lastChange', type: 'date', dateFormat: 'n/j h:ia'},
            {name: 'industry'},
            {name: 'desc'}
         ]
    });
    // Array data for the grids
    Ext.grid.dummyData = [
        ['3m Co',71.72,0.02,0.03,'9/1 12:00am', 'Manufacturing'],
        ['Alcoa Inc',29.01,0.42,1.47,'9/1 12:00am', 'Manufacturing'],
        ['Altria Group Inc',83.81,0.28,0.34,'9/1 12:00am', 'Manufacturing'],
        ['American Express Company',52.55,0.01,0.02,'9/1 12:00am', 'Finance'],
        ['American International Group, Inc.',64.13,0.31,0.49,'9/1 12:00am', 'Services'],
        ['AT&T Inc.',31.61,-0.48,-1.54,'9/1 12:00am', 'Services'],
        ['Boeing Co.',75.43,0.53,0.71,'9/1 12:00am', 'Manufacturing'],
        ['Caterpillar Inc.',67.27,0.92,1.39,'9/1 12:00am', 'Services'],
        ['Citigroup, Inc.',49.37,0.02,0.04,'9/1 12:00am', 'Finance'],
        ['E.I. du Pont de Nemours and Company',40.48,0.51,1.28,'9/1 12:00am', 'Manufacturing'],
        ['Exxon Mobil Corp',68.1,-0.43,-0.64,'9/1 12:00am', 'Manufacturing'],
        ['General Electric Company',34.14,-0.08,-0.23,'9/1 12:00am', 'Manufacturing'],
        ['General Motors Corporation',30.27,1.09,3.74,'9/1 12:00am', 'Automotive'],
        ['Hewlett-Packard Co.',36.53,-0.03,-0.08,'9/1 12:00am', 'Computer'],
        ['Honeywell Intl Inc',38.77,0.05,0.13,'9/1 12:00am', 'Manufacturing'],
        ['Intel Corporation',19.88,0.31,1.58,'9/1 12:00am', 'Computer'],
        ['International Business Machines',81.41,0.44,0.54,'9/1 12:00am', 'Computer'],
        ['Johnson & Johnson',64.72,0.06,0.09,'9/1 12:00am', 'Medical'],
        ['JP Morgan & Chase & Co',45.73,0.07,0.15,'9/1 12:00am', 'Finance'],
        ['McDonald\'s Corporation',36.76,0.86,2.40,'9/1 12:00am', 'Food'],
        ['Merck & Co., Inc.',40.96,0.41,1.01,'9/1 12:00am', 'Medical'],
        ['Microsoft Corporation',25.84,0.14,0.54,'9/1 12:00am', 'Computer'],
        ['Pfizer Inc',27.96,0.4,1.45,'9/1 12:00am', 'Medical'],
        ['The Coca-Cola Company',45.07,0.26,0.58,'9/1 12:00am', 'Food'],
        ['The Home Depot, Inc.',34.64,0.35,1.02,'9/1 12:00am', 'Retail'],
        ['The Procter & Gamble Company',61.91,0.01,0.02,'9/1 12:00am', 'Manufacturing'],
        ['United Technologies Corporation',63.26,0.55,0.88,'9/1 12:00am', 'Computer'],
        ['Verizon Communications',35.57,0.39,1.11,'9/1 12:00am', 'Services'],
        ['Wal-Mart Stores, Inc.',45.45,0.73,1.63,'9/1 12:00am', 'Retail'],
        ['Walt Disney Company (The) (Holding Company)',29.89,0.24,0.81,'9/1 12:00am', 'Services']
    ];

    // add in some dummy descriptions
    for(var i = 0; i < Ext.grid.dummyData.length; i++){
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
        columns: [
            {text: "Company", width: 200, dataIndex: 'company'},
            {text: "Price", renderer: Ext.util.Format.usMoney, dataIndex: 'price'},
            {text: "Change", dataIndex: 'change'},
            {text: "% Change", dataIndex: 'pctChange'},
            {text: "Last Updated", width: 135, renderer: Ext.util.Format.dateRenderer('m/d/Y'), dataIndex: 'lastChange'}
        ],
        columnLines: true,
        width: 600,
        height: 300,
        frame: true,
        title: 'Framed with Checkbox Selection and Horizontal Scrolling',
        iconCls: 'icon-grid',
        margin: '0 0 20 0',
        renderTo: Ext.getBody()
    });
    
    
    
    
    
    
    
    
    
    /*var comboxCZFStates = Ext.create('Ext.data.Store', {
		fields: ['value', 'text'],
		data: [{
				"value": "=",
				"text": "等于"
			},
		]
        groupField: 'department',
        model: 'Employee'
	});*/
    
    /*var store = Ext.create('Ext.data.Store', {
		fields: ['value', 'text'],
		data: [{
				"value": "=",
				"text": "等于"
			},
		]
    });
    
    var jumpToRow = function(){
        var fld = grid.down('#gotoLine');
        if (fld.isValid()) {
            grid.view.bufferedRenderer.scrollTo(fld.getValue() - 1, true);
        }    
    };
    
    var data = [],
        perBatch = 1000,
        max = 5000;
    
    var grid = Ext.create('Ext.grid.Panel', {
        width: 700,
        height: 500,
        title: 'Buffered Grid of 5,000 random records',
        store: store,
        loadMask: true,
        plugins: 'bufferedrenderer',
        selModel: {
            pruneRemoved: false
        },
        viewConfig: {
            trackOver: false
        },
        features: [{
            ftype: 'groupingsummary',
            groupHeaderTpl: 'Department: {name}',
            showSummaryRow: false
        }],
        // grid columns
        columns:[{
            xtype: 'rownumberer',
            width: 40,
            sortable: false
        }, {
            text: 'Id',
            sortable: true,
            dataIndex: 'employeeNo',
            groupable: false,
            width: 70
        }, {
            text: 'Name',
            sortable: true,
            dataIndex: 'name',
            groupable: false,
            renderer: function(v, cellValues, rec) {
                return rec.get('forename') + ' ' + rec.get('surname');
            },
            width: 120
        }, {
            text: 'Date of birth',
            dataIndex: 'dob',
            xtype: 'datecolumn',
            groupable: false
        }, {
            text: 'Join date',
            dataIndex: 'joinDate',
            xtype: 'datecolumn',
            groupable: false
        }, {
            text: 'Notice period',
            dataIndex: 'noticePeriod',
            groupable: false
        }, {
            text: 'Email address',
            dataIndex: 'email',
            width: 200,
            groupable: false,
            renderer: function(v) {
                return '<a href="mailto:' + v + '">' + v + '</a>';
            }
        }, {
            text: 'Department',
            dataIndex: 'department',
            hidden: true,
            hideable: false,
            groupable: false
        }, {
            text: 'Absences',
            columns: [{
                text: 'Illness',
                dataIndex: 'sickDays',
                width: 60,
                groupable: false
            }, {
                text: 'Holidays',
                dataIndex: 'holidayDays',
                width: 70,
                groupable: false
            }, {
                text: 'Holday Allowance',
                dataIndex: 'holidayAllowance',
                width: 125,
                groupable: false
            }]
        }, {
            text: 'Rating',
            width: 70,
            sortable: true,
            dataIndex: 'rating',
            groupable: false
        }, {
            text: 'Salary',
            width: 110,
            sortable: true,
            dataIndex: 'salary',
            align: 'right',
            renderer: Ext.util.Format.usMoney,
            groupable: false
        }],
        bbar: [{
            labelWidth: 80,
            fieldLabel: 'Jump to row',
            xtype: 'numberfield',
            minValue: 1,
            maxValue: max,
            allowDecimals: false,
            itemId: 'gotoLine',
            enableKeyEvents: true,
            listeners: {
                specialkey: function(field, e){
                    if (e.getKey() === e.ENTER) {
                        jumpToRow();
                    }
                }
            }
        }, {
            text: 'Go',
            handler: jumpToRow
        }],
        //renderTo: Ext.getBody()
    });*/
});