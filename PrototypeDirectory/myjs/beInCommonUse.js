// 1.是否重新入库 下拉列表中的值
var toPutInStorageData = [{
		'text': '是',
		"value": "Yes"
	},
	{
		'text': '否',
		"value": "No"
	}
];
// 1.是否重新入库 的Store对象 
var toPutInStorageStore = Ext.create('Ext.data.Store', {
	fields: ['text', 'value'],
	data: toPutInStorageData
});

// 2.是否含税 下拉列表中的值
var whetherTheTaxData = [{
		'text': '未税',
		"value": "weishui"
	},
	{
		'text': '含税',
		"value": "hanshui"
	}
];
// 2.是否含税 的Store对象 
var whetherTheTaxStore = Ext.create('Ext.data.Store', {
	fields: ['text', 'value'],
	data: whetherTheTaxData
});

// 3.单况 下拉列表中的值
var aSingleCaseData = [{
		'text': '已结案',
		"value": "yijiean"
	},
	{
		'text': '未结案',
		"value": "weijiean"
	},
	{
		'text': '无效',
		"value": "wuxiao"
	}
];
// 3.单况 的Store对象 
var aSingleCaseStore = Ext.create('Ext.data.Store', {
	fields: ['text', 'value'],
	data: aSingleCaseData
});

// 4.付款条件 下拉列表中的值
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
// 4.付款条件 的Store对象 
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






//
function insertButton() {
	var svalue =
		Ext.getCmp('supplier').getValue() + "---" +
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
function deleteButton() {
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