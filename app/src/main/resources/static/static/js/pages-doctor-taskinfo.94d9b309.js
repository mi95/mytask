(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-doctor-taskinfo"],{"0608":function(n,t,e){"use strict";e.r(t);var a=e("1ae6"),i=e.n(a);for(var o in a)"default"!==o&&function(n){e.d(t,n,(function(){return a[n]}))}(o);t["default"]=i.a},"1ae6":function(n,t,e){"use strict";var a=e("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var i=a(e("3835"));e("96cf");var o=a(e("1da1")),s=a(e("5530")),r=e("2f62"),d=(e("0c9f"),{props:{focus:{type:Boolean,default:!1}},data:function(){return{imageList:[],sourceType:["拍照","相册","拍照或相册"],countIndex:1,count:[1],image11:"https://wx.gzyz1.com/public/uploads/20200826114430_13804.jpg",imgs:!1,text:"",imgUrl:this.config.imgUrl,isnone:"none",ysData:[],newItems:[],comment:[],options:[],urls:"",couse:"0",isgzs:"0",data:[],buz:[],names:"",nickname:"",userid:"",users:[],lname:"领取任务",islname:0}},onLoad:function(n){this.options=n},onShow:function(){this.ongrzlTap(this.options.id)},computed:(0,s.default)({},(0,r.mapState)(["hasLogin","userInfo"])),methods:{bntbox:function(){var n=this;return(0,o.default)(regeneratorRuntime.mark((function t(){var e,a,o,s,r;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return n.hasLogin||(url="/pages/public/login"),e={},e.name=n.data.name,e.oid=n.data.id,e.price=n.data.price,e.img=n.data.avatar,e.token=uni.getStorageSync("userInfo").token,e.uid=uni.getStorageSync("userInfo").id,t.next=10,n.$http.get("/api/mytask/lqrw",e);case 10:if(a=t.sent,o=(0,i.default)(a,2),s=o[0],r=o[1],n.$http.errorCheck(s,r)){t.next=16;break}return t.abrupt("return");case 16:1==r.data.code?(n.$api.msg(r.data.msg),n.lname=r.data.msg,n.ongrzlTap(n.options.id)):n.$api.msg(r.data.msg);case 17:case"end":return t.stop()}}),t)})))()},tel:function(n){uni.makePhoneCall({phoneNumber:this.users.mobile})},navTo:function(n){this.hasLogin||(n="/pages/public/login"),uni.navigateTo({url:n})},renwjsuan:function(n){var t=this;return(0,o.default)(regeneratorRuntime.mark((function e(){var a,o,s,r,d;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a={},a.id=n,a.token=uni.getStorageSync("userInfo").token,e.next=5,t.$http.get("/api/mytask/renwjsuan",a);case 5:if(o=e.sent,s=(0,i.default)(o,2),r=s[0],d=s[1],t.$http.errorCheck(r,d)){e.next=11;break}return e.abrupt("return");case 11:1==d.data.code?uni.showModal({title:"提示",content:d.data.msg,showCancel:!1,success:function(n){t.ongrzlTap(t.options.id)}}):t.$api.msg(d.data.msg);case 12:case"end":return e.stop()}}),e)})))()},statuson:function(n){var t=this;return(0,o.default)(regeneratorRuntime.mark((function e(){var a,o,s,r,d;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a={},a.id=n,a.token=uni.getStorageSync("userInfo").token,e.next=5,t.$http.get("/api/mytask/statuson",a);case 5:if(o=e.sent,s=(0,i.default)(o,2),r=s[0],d=s[1],t.$http.errorCheck(r,d)){e.next=11;break}return e.abrupt("return");case 11:1==d.data.code?uni.showModal({title:"提示",content:d.data.msg,showCancel:!1,success:function(n){t.ongrzlTap(t.options.id)}}):t.$api.msg(d.data.msg);case 12:case"end":return e.stop()}}),e)})))()},statusn:function(n){var t=this;return(0,o.default)(regeneratorRuntime.mark((function e(){var a,o,s,r,d;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a={},a.id=n,a.token=uni.getStorageSync("userInfo").token,e.next=5,t.$http.get("/api/mytask/statusn",a);case 5:if(o=e.sent,s=(0,i.default)(o,2),r=s[0],d=s[1],t.$http.errorCheck(r,d)){e.next=11;break}return e.abrupt("return");case 11:1==d.data.code?uni.showModal({title:"提示",content:d.data.msg,showCancel:!1,success:function(n){t.ongrzlTap(t.options.id)}}):t.$api.msg(d.data.msg);case 12:case"end":return e.stop()}}),e)})))()},del:function(n){var t=this;uni.showModal({title:"提示",content:"是否确定取消",success:function(e){e.confirm?t.dels(n):e.cancel&&console.log("用户点击取消")}})},dels:function(n){var t=this;return(0,o.default)(regeneratorRuntime.mark((function e(){var a,o,s,r,d;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a={},a.id=n,a.token=uni.getStorageSync("userInfo").token,e.next=5,t.$http.get("/api/mytask/del",a);case 5:if(o=e.sent,s=(0,i.default)(o,2),r=s[0],d=s[1],t.$http.errorCheck(r,d)){e.next=11;break}return e.abrupt("return");case 11:1==d.data.code?uni.showModal({title:"提示",content:d.data.msg,showCancel:!1,success:function(n){uni.navigateBack()}}):t.$api.msg(d.data.msg);case 12:case"end":return e.stop()}}),e)})))()},previewImage:function(n){var t=n.target.dataset.src;uni.previewImage({current:t,urls:this.imageList})},previewImage1:function(n){console.log(n);var t=n.target.dataset.src;uni.previewImage({current:1,urls:[t]})},ongrzlTap:function(n){var t=this;return(0,o.default)(regeneratorRuntime.mark((function e(){var a,o,s,r,d;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a={id:n},uni.getStorageSync("userInfo").id>0&&(a.uid=uni.getStorageSync("userInfo").id),e.next=4,t.$http.get("/api/index/info",a);case 4:if(o=e.sent,s=(0,i.default)(o,2),r=s[0],d=s[1],t.$http.errorCheck(r,d)){e.next=10;break}return e.abrupt("return");case 10:d.data?(t.data=d.data,t.islname=d.data.islname,d.data.users.nickname&&(t.nickname=d.data.users.nickname,t.userid=d.data.users.id),d.data.users&&(t.users=d.data.users)):t.$api.msg(d.data.msg);case 11:case"end":return e.stop()}}),e)})))()}}});t.default=d},"307d":function(n,t,e){var a=e("9a2d");"string"===typeof a&&(a=[[n.i,a,""]]),a.locals&&(n.exports=a.locals);var i=e("4f06").default;i("7328d318",a,!0,{sourceMap:!1,shadowMode:!1})},"9a2d":function(n,t,e){var a=e("24fb");t=a(!1),t.push([n.i,'\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n/* page {\n\tbackground: url(http://www.scgyly.com/images/ybg.svg);\n\tbackground-position: top center;\n\tbackground-repeat: no-repeat;\n\tbackground-size: 100%;\n} */.hids[data-v-02ad5db6]{padding-bottom:%?200?%!important}.names[data-v-02ad5db6]{width:92%;margin:0 auto;padding:%?0?% %?10?%;height:%?80?%;line-height:%?80?%;font-size:%?28?%;color:#333;-webkit-box-sizing:border-box;box-sizing:border-box;background:#f3f3f3;-webkit-border-radius:%?6?%;border-radius:%?6?%}.bpdi[data-v-02ad5db6]{font-size:%?28?%;color:#999;padding-left:%?20?%;-webkit-box-sizing:border-box;box-sizing:border-box;font-weight:400}.bntbox[data-v-02ad5db6]{width:100%;height:40px;line-height:40px;background:#ffb400;color:#fff;position:fixed;left:0;right:0;bottom:0;z-index:999;text-align:center;font-size:%?32?%;font-weight:600}.bntbox501[data-v-02ad5db6]{width:50%;height:%?100?%;line-height:%?100?%;background:#007aff;color:#fff;position:fixed;left:0;bottom:0;z-index:999;text-align:center;font-size:%?32?%;font-weight:600}.bntbox502[data-v-02ad5db6]{width:50%;height:%?100?%;line-height:%?100?%;background:#ffb400;color:#fff;position:fixed;right:0;bottom:0;z-index:999;text-align:center;font-size:%?32?%;font-weight:600}.bntbox1[data-v-02ad5db6]{width:100%;height:40px;line-height:40px;background:#ccc;color:#999;position:fixed;left:0;right:0;bottom:0;z-index:999;text-align:center;font-size:%?32?%;font-weight:600}.bntbox[data-v-02ad5db6]:active{background:#ffac45;color:#fff}.ysmain[data-v-02ad5db6]{padding-bottom:%?40?%}.uni-uploader__file[data-v-02ad5db6]{position:relative;margin:4px!important}.iconshanchu[data-v-02ad5db6]{z-index:1;position:absolute;right:%?-10?%;top:%?-10?%;width:%?46?%;height:%?46?%;-webkit-border-radius:50%;border-radius:50%;line-height:%?40?%;text-align:center;background:#ff1919;font-size:%?24?%;color:#fff;border:2px solid #fafafa}.wdmstitleimg[data-v-02ad5db6]{padding:%?8?% %?0?%;padding-left:%?50?%;font-size:%?32?%;font-weight:500;position:relative;border-bottom:%?1?% solid #e5e5e5}.wdmstitleimg uni-text[data-v-02ad5db6]{color:#999;font-size:%?28?%}.wdmstitleimg[data-v-02ad5db6]:after{font-family:iconfont;position:absolute;top:2px;left:6px;content:"\\e716";font-size:%?36?%;color:#07c}.conts[data-v-02ad5db6]{text-align:center;line-height:20px;padding-top:%?10?%;-webkit-box-sizing:border-box;box-sizing:border-box}.letitle[data-v-02ad5db6]{font-size:%?32?%;color:#333;font-weight:700;line-height:24px}.conts uni-image[data-v-02ad5db6]{width:24px;height:20px}.conts uni-view[data-v-02ad5db6]{line-height:20px}.avatarnr[data-v-02ad5db6]{padding-left:%?10?%;-webkit-box-sizing:border-box;box-sizing:border-box}.avaxxt uni-text[data-v-02ad5db6]{-webkit-border-radius:%?20?%;border-radius:%?20?%;padding:%?2?% %?10?%;-webkit-box-sizing:border-box;box-sizing:border-box}.avataruser uni-text[data-v-02ad5db6]{color:#111;font-size:%?32?%;font-weight:700}.avaxxt .mas1[data-v-02ad5db6]{background:#ffac45;font-size:%?20?%;color:#fff;margin-right:%?20?%}.avaxxt .mas2[data-v-02ad5db6]{background:#ff4443;font-size:%?20?%;color:#fff}.ty1 uni-view[data-v-02ad5db6]:nth-child(1){font-size:%?32?%;color:#111;line-height:%?46?%;font-weight:700;text-align:justify;text-align-last:left}.ty2 uni-view[data-v-02ad5db6]:nth-child(1){color:#666;font-size:%?32?%;font-weight:700}.ty2 uni-view[data-v-02ad5db6]:nth-child(2){color:#f17503;font-size:%?32?%;font-weight:700}.mrimg[data-v-02ad5db6]{width:%?180?%;height:%?180?%;-webkit-border-radius:5px;border-radius:5px}.simtp[data-v-02ad5db6]{font-size:10px;color:#a1a1a1;background:#f8f8f8;padding:2px 4px;-webkit-border-radius:2px;border-radius:2px;margin-right:%?10?%}.simtp1[data-v-02ad5db6]{color:red!important}.smsmsg[data-v-02ad5db6]{width:94%;margin:0 auto;font-size:%?20?%!important;border-bottom:1px solid #e5e5e5}.smsmsg>uni-view[data-v-02ad5db6]{line-height:%?80?%;color:#999}.bclis[data-v-02ad5db6]{line-height:50px;margin-top:%?24?%;padding-left:4%;border-top:10px solid #e5e5e5;-webkit-box-sizing:border-box;box-sizing:border-box;font-size:%?32?%;font-weight:700;color:#777}.nums[data-v-02ad5db6]{background:#ffb400;color:#333;width:%?45?%;height:%?45?%;text-align:center;line-height:%?45?%;-webkit-border-radius:50%;border-radius:50%;position:absolute;top:%?0?%;left:%?20?%}.lets[data-v-02ad5db6]{width:94%;margin:%?0?% auto;padding-left:%?80?%;position:relative;padding-bottom:%?40?%;-webkit-box-sizing:border-box;box-sizing:border-box}.lets[data-v-02ad5db6]::before{content:"";width:%?2?%;height:100%;background:#eee;position:absolute;left:%?43?%;top:0}.ysmain .lets[data-v-02ad5db6]:last-of-type::before{background:#fff!important}.letp[data-v-02ad5db6]{text-align:justify;text-align-last:left;font-size:%?28?%;color:#666;line-height:%?40?%}.topbox[data-v-02ad5db6]{width:94%;margin:%?0?% auto;margin-top:%?20?%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-justify-content:space-around;justify-content:space-around;-webkit-align-content:center;align-content:center;border-bottom:1px solid #e5e5e5;padding-bottom:%?20?%}.kiss[data-v-02ad5db6]{width:94%;margin:%?0?% auto;margin-top:%?20?%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-justify-content:space-around;justify-content:space-around;-webkit-align-content:center;align-content:center}.ty1[data-v-02ad5db6]{-webkit-box-flex:3.5;-webkit-flex:3.5;flex:3.5;padding-right:%?20?%;-webkit-box-sizing:border-box;box-sizing:border-box}.ty2[data-v-02ad5db6]{-webkit-box-flex:1.5;-webkit-flex:1.5;flex:1.5;border-left:1px solid #e5e5e5;padding-left:%?10?%;-webkit-box-sizing:border-box;box-sizing:border-box}.ki1[data-v-02ad5db6]{-webkit-box-flex:4;-webkit-flex:4;flex:4;padding-right:%?20?%;-webkit-box-sizing:border-box;box-sizing:border-box}.ki2[data-v-02ad5db6]{-webkit-box-flex:1;-webkit-flex:1;flex:1;padding-left:%?10?%;-webkit-box-sizing:border-box;box-sizing:border-box}.ki2 uni-view[data-v-02ad5db6]{color:#666}.avatarg[data-v-02ad5db6]{text-align:center}.avatarg uni-image[data-v-02ad5db6]{width:50px;height:50px;-webkit-border-radius:50%;border-radius:50%}',""]),n.exports=t},a103:function(n,t,e){"use strict";var a=e("307d"),i=e.n(a);i.a},be6d:function(n,t,e){"use strict";e.r(t);var a=e("e78f"),i=e("0608");for(var o in i)"default"!==o&&function(n){e.d(t,n,(function(){return i[n]}))}(o);e("a103");var s,r=e("f0c5"),d=Object(r["a"])(i["default"],a["b"],a["c"],!1,null,"02ad5db6",null,!1,a["a"],s);t["default"]=d.exports},e78f:function(n,t,e){"use strict";var a;e.d(t,"b",(function(){return i})),e.d(t,"c",(function(){return o})),e.d(t,"a",(function(){return a}));var i=function(){var n=this,t=n.$createElement,a=n._self._c||t;return a("v-uni-view",[a("v-uni-view",{staticClass:"docTop"},[a("v-uni-view",{staticClass:"topbox"},[a("v-uni-view",{staticClass:"ty1"},[a("v-uni-view",{},[n._v(n._s(n.data.name))]),a("v-uni-view",{staticClass:"u-f u-f-ac"},[a("v-uni-text",{staticClass:"simtp"},[n._v("ID:"+n._s(n.data.id))]),a("v-uni-text",{staticClass:"simtp"},[n._v(n._s(n.data.type))])],1)],1),a("v-uni-view",{staticClass:"ty2"},[a("v-uni-view",{staticStyle:{"font-size":"24upx"}},[n._v("总数："+n._s(1*n.data.zprice))]),a("v-uni-view",{staticStyle:{"font-size":"24upx"}},[n._v("累计："+n._s(1*n.data.kprice))])],1)],1),a("v-uni-view",{staticClass:"smsmsg u-f u-f-ac u-f-jsb"},[a("v-uni-view",{staticClass:"simtp1"},[n._v(n._s(n.data.sumed)+"人已赚")]),a("v-uni-view",{staticClass:"simtp1"},[n._v("剩余"+n._s(n.data.sumsy)+"个")]),a("v-uni-view",{staticClass:"simtp1"},[n._v("每个￥"+n._s(n.data.price))])],1),a("v-uni-view",{staticClass:"kiss"},[a("v-uni-view",{staticClass:"ki1 u-f u-f-ac u-f-l"},[a("v-uni-view",{staticClass:"avatarg u-f u-f-ac u-f-ajc"},[a("v-uni-image",{attrs:{src:n.data.avatar,mode:"aspectFill"}})],1),a("v-uni-view",{staticClass:"avatarnr"},[a("v-uni-view",{staticClass:"avataruser u-f-ajc"},[a("v-uni-text",[n._v(n._s(n.nickname||""))]),a("v-uni-text",[n._v("UID："+n._s(n.userid||""))])],1),a("v-uni-view",{staticClass:"avaxxt"},[a("v-uni-text",{staticClass:"mas1"},[n._v(n._s(2==n.users.isrz?"实名认证":"未认证"))]),a("v-uni-text",{staticClass:"mas2"},[n._v(n._s(n.data.Groupname||""))])],1)],1)],1),2==n.users.istel?a("v-uni-view",{staticClass:"ki2 conts",on:{click:function(t){arguments[0]=t=n.$handleEvent(t),n.tel.apply(void 0,arguments)}}},[a("v-uni-image",{attrs:{src:e("7c4e"),mode:"aspectFill"}}),a("v-uni-view",{},[n._v("联系商家")])],1):n._e()],1)],1),a("v-uni-view",{staticClass:"ysmain"},[a("v-uni-view",{staticClass:"bclis"},[n._v("任务步骤")]),n._l(n.data.buz,(function(t,e){return[a("v-uni-view",{key:e+"_0",staticClass:"lets"},[a("v-uni-view",{staticClass:"nums"},[n._v(n._s(e+1))]),a("v-uni-view",{},[a("v-uni-view",{staticClass:"letitle"},[n._v("步骤"+n._s(e+1)+" (说明)")]),a("v-uni-view",{staticClass:"letp"},[n._v(n._s(t.name))])],1),a("v-uni-view",{staticClass:"uni-uploader-body"},[a("v-uni-view",{staticClass:"uni-uploader__files"},[n._l(t.img,(function(e,i){return t.img?[a("v-uni-view",{key:i+"_0",staticClass:"uni-uploader__file"},[a("v-uni-image",{staticClass:"mrimg",attrs:{src:e,"data-src":e,mode:"aspectFill"},on:{click:function(t){arguments[0]=t=n.$handleEvent(t),n.previewImage1.apply(void 0,arguments)}}})],1)]:n._e()}))],2)],1)],1)]}))],2),1==n.data.paytype?a("v-uni-view",{staticClass:"bntbox501",on:{click:function(t){arguments[0]=t=n.$handleEvent(t),n.navTo("/pages/money/pay?id="+n.data.id)}}},[n._v("付款")]):n._e(),1==n.data.paytype?a("v-uni-view",{staticClass:"bntbox502",on:{click:function(t){arguments[0]=t=n.$handleEvent(t),n.del(n.data.id)}}},[n._v("取消")]):n._e(),2==n.data.paytype?a("v-uni-view",{staticClass:"bntbox",on:{click:function(t){arguments[0]=t=n.$handleEvent(t),n.statusn(n.data.id)}}},[n._v("暂停推广")]):n._e(),"hidden"==n.data.status?a("v-uni-view",{staticClass:"bntbox1",on:{click:function(t){arguments[0]=t=n.$handleEvent(t),n.statuson(n.data.id)}}},[n._v("取消暂停推广")]):n._e(),n.data.endtimesjc<n.data.newtime?a("v-uni-view",{staticClass:"bntbox1",on:{click:function(t){arguments[0]=t=n.$handleEvent(t),n.renwjsuan(n.data.id)}}},[n._v("任务过期 "+n._s(n.data.zprice-n.data.kprice)+"可结算")]):n._e()],1)},o=[]}}]);