Ext.onReady(function() {
	// 采购模块 - 创建六个按钮
	var indexMenuPurchaseButton1 = Ext.create('Ext.button.Button', {
		text: "打开采购请购单",
		id: "btnP1Show",
		name: "btnP1Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			PurchasePurchaseRequisition.show();
		}
	});

	var indexMenuPurchaseButton2 = Ext.create('Ext.button.Button', {
		text: "打开采购询价单",
		id: "btnP2Show",
		name: "btnP2Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			PurchaseInquiryList.show();
		}
	});
	
	var indexMenuPurchaseButton3 = Ext.create('Ext.button.Button', {
		text: "打开采购订单",
		id: "btnP3Show",
		name: "btnP3Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			PurchaseOrder.show();
		}
	});

	var indexMenuPurchaseButton4 = Ext.create('Ext.button.Button', {
		text: "打开采购入库单",
		id: "btnP4Show",
		name: "btnP4Show",
		width: 99,
		height: 50,
		margin: 5,
		//renderTo: Ext.getBody(),
		handler: function() {
			PurchaseEnterWarehouse.show();
			//PurchaseEnterWarehouse.close();
		}
	});

	var indexMenuPurchaseButton5 = Ext.create('Ext.button.Button', {
		text: "打开采购退货单",
		id: "btnP5Show",
		name: "btnP5Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			PurchaseReturn.show();
		}
	});

	var indexMenuPurchaseButton8 = Ext.create('Ext.button.Button', {
		text: "打开采购分摊",
		id: "btnP8Show",
		name: "btnP8Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			PurchaseApportion.show();
		}
	});
	
	// 销售模块 - 创建五个按钮
	var indexMenuSellButton1 = Ext.create('Ext.button.Button', {
		text: "打开销售报价单",
		id: "btnS1Show",
		name: "btnS1Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			SellQuotation.show();
		}
	});
	
	var indexMenuSellButton2 = Ext.create('Ext.button.Button', {
		text: "打开销售订单",
		id: "btnS2Show",
		name: "btnS2Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			SellOrder.show();
		}
	});
	
	var indexMenuSellButton3 = Ext.create('Ext.button.Button', {
		text: "打开销售出库单",
		id: "btnS3Show",
		name: "btnS3Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			SellStockOut.show();
		}
	});
	
	var indexMenuSellButton4 = Ext.create('Ext.button.Button', {
		text: "打开销售退货单",
		id: "btnS4Show",
		name: "btnS4Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			SellReturn.show();
		}
	});
	
	var indexMenuSellButton5 = Ext.create('Ext.button.Button', {
		text: "打开销售发票",
		id: "btnS5Show",
		name: "btnS5Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			SellInvoice.show();
		}
	});
	
	// 库存模块 - 创建三个按钮
	var indexMenuInventoryButton1 = Ext.create('Ext.button.Button', {
		text: "打开调拨单",
		id: "btnI1Show",
		name: "btnI1Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			TransferringOrder.show();
		}
	});
	
	var indexMenuInventoryButton2 = Ext.create('Ext.button.Button', {
		text: "打开盘点单",
		id: "btnI2Show",
		name: "btnI2Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			InventoryList.show();
		}
	});
	
	var indexMenuInventoryButton3 = Ext.create('Ext.button.Button', {
		text: "打开盘点单",
		id: "btnI3Show",
		name: "btnI3Show",
		width: 99,
		height: 50,
		margin: 5,
		handler: function() {
			ChangePriceBill.show();
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
			indexMenuPurchaseButton1,
			indexMenuPurchaseButton2,
			indexMenuPurchaseButton3,
			indexMenuPurchaseButton4,
			indexMenuPurchaseButton5,
			indexMenuPurchaseButton8,
			indexMenuSellButton1,
			indexMenuSellButton2,
			indexMenuSellButton3,
			indexMenuSellButton4,
			indexMenuSellButton5,
			indexMenuInventoryButton1,
			indexMenuInventoryButton2,
			indexMenuInventoryButton3,
		]
	});

	//创建活动的Window窗体
	var win = Ext.create('Ext.window.Window', {
		id: "indexWin",
		title: "竹林流沙进销存系统 - 图形选单 - 主菜单",
		width: 666,
		height: 437,
		layout: 'fit', 		// 弹出窗口内布局会充满整个窗口;
		modal: false, 		// 是否为模式化窗体
		closable: true, 	// Extjs Window可以配置是否显示关闭按钮：
		closeAction: 'hide',// 在关闭Extjs Window的时候，通过配置项closeAction可以控制按钮是销毁（destroy）还是隐藏（hide），默认情况下为销毁：
		maximizable: true, 	// 最大化按钮
		minimizable: true, 	// 最小化按钮
		constrain: true,	// 保证整个窗口不会越过浏览器的边界;
		resizable: true, 	// 窗口可拖动改变大小;
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

});