$(function(){
    var fwlLCBW = $('.fwlLCBox .fwlLCB').width();
     $('.fwlLCBox .fwlLCB').css('margin-left',-fwlLCBW*0.5)
     
     var gjsRCBW = $('.gjsRCbox .gjsRCB').width();
     $('.gjsRCbox .gjsRCB').css('margin-left',-gjsRCBW*0.5)
	scale()

   $(window).resize(function(){
                scale()
             })
    function scale(){
        var winWidth = window.innerWidth;
        var winheight = window.innerHeight;
        var widthProportion = winWidth/3840;
        var heightProportion = winheight/2160;
        if(widthProportion > heightProportion){
            var zzProportion = heightProportion;
            var leftWidth = zzProportion*3840
        }else{
            var zzProportion = widthProportion;
            var leftWidth = winWidth;
        }
         $('.sTdp19Box')
         .css({'transform':'scale('+zzProportion+','+zzProportion+')','left':(winWidth-leftWidth)/2+"px"});
    }

	
    
    
    function xxgkEchart(){
    	var xxgkwidth = $('#xxgkEchart').width();
    	var xxgkheight = $('#xxgkEchart').height();
	    $('.xxgkImg').css({'margin-top':(-xxgkwidth*0.4)/2+'px','margin-left':(-xxgkwidth*0.4)/2+'px'})
	    var option2 = {
			    tooltip : {
			        trigger: 'item',
			        formatter: "{b}<br>总量{c}条<br>{d}%"
			    },
			    color:['#477bd3', '#23b0c2','#7ad548','#ebae0a', '#e64c55','#ba6190','#dda3ee'],
			    legend: {
			        x : 'center',
			        y : 'top',
			        data:['概况类信息更新量','政务动态信息更新量','信息公开目录信息更新量','解读信息发布','回应公众关注数量','留言办理公开答复数','在线访谈期数'],
			        textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
		                            color: '#9dcdf8',
		                            fontSize:36,
		                            lineHeight: 42,
		                        }
			    },
			    calculable : true,
			    series : [
			        {
			            type:'pie',
			            //radius : [20, xxgkwidth/5],
			            radius : ['20%', '60%'],
			            center : ['50%', '50%'],
			            roseType : 'area',
			            label: {
			                normal: {
			                    formatter: '{b|{b}}\n{c|总量{c}条 } {per|{d}%}  ',
			                    //backgroundColor: '#eee',
			                    //borderColor: '#aaa',
			                    //borderWidth: 1,
			                    //borderRadius: 4,
			                    // shadowBlur:3,
			                    // shadowOffsetX: 2,
			                    // shadowOffsetY: 2,
			                    // shadowColor: '#999',
			                    // padding: [0, 7],
			                    rich: {
			                        a: {
			                            color: '#999',
			                            lineHeight: 22,
			                            align: 'center'
			                        },
			                        // abg: {
			                        //     backgroundColor: '#333',
			                        //     width: '100%',
			                        //     align: 'right',
			                        //     height: 22,
			                        //     borderRadius: [4, 4, 0, 0]
			                        // },
			                        hr: {
			                            borderColor: '#aaa',
			                            width: '100%',
			                            borderWidth: 0.5,
			                            height: 0
			                        },
			                        b: {
			                            fontSize: 32,
			                            /*fontWeight:'600',*/
			                            lineHeight: 38,
			                        },
			                         c: {
			                            /*color: '#eee',
			                            backgroundColor: '#334455',
			                            padding: [2, 4],
			                            borderRadius: 2*/
			                           lineHeight: 16,
			                           fontSize: 32,
			                            fontWeight:'600',
			                            lineHeight: 38,
			                        },
			                        per: {
			                            /*color: '#eee',
			                            backgroundColor: '#334455',
			                            padding: [2, 4],
			                            borderRadius: 2*/
			                           lineHeight: 16,
			                           fontSize: 32,
			                            fontWeight:'600',
			                            lineHeight: 38,
			                        }
			                    }
			                },
			                emphasis: {
			                    show: true,
			                   /* textStyle: {
			                        fontSize: '30',
			                        fontWeight: 'bold'
			                    }*/
			                }
			            },
			            data:[
			                {value:700, name:'概况类信息更新量'},
			                {value:300, name:'政务动态信息更新量'},
			                {value:110, name:'信息公开目录信息更新量'},
			                {value:200, name:'解读信息发布'},
			                {value:900, name:'回应公众关注数量'},
			                {value:610, name:'留言办理公开答复数'},
			                {value:200, name:'在线访谈期数'},
			            ]
			        }
			    ],
			};
	    
	    var myChart = echarts.init(document.getElementById('xxgkEchart'));
	    myChart.setOption(option2);
	    
	   
    }  
})
