import java.util.Scanner;
public class EysenckPersonalityQuestionnaire {

	public static void main(String[] args) {

		//定义85道题答案的变量
		int q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,
		q11,q12,q13,q14,q15,q16,q17,q18,q19,q20,
		q21,q22,q23,q24,q25,q26,q27,q28,q29,q30,
		q31,q32,q33,q34,q35,q36,q37,q38,q39,q40,
		q41,q42,q43,q44,q45,q46,q47,q48,q49,q50,
		q51,q52,q53,q54,q55,q56,q57,q58,q59,q60,
		q61,q62,q63,q64,q65,q66,q67,q68,q69,q70,
		q71,q72,q73,q74,q75,q76,q77,q78,q79,q80,
		q81,q82,q83,q84,q85;
		Scanner sca=new Scanner(System.in);
		
		System.out.println();
		System.out.println("*****欢迎进行艾森克人格问卷测试*****");
		System.out.println();
		System.out.println("    艾森克人格理论(Eysenck's personality theory)英国心理学家H．J．艾森克提出的以人格结构层级说和三维度人格类型"
				         + "说为主要内容的人格理论。他认为，人格是由行为和行为群有机组织而成的层级结构。最低层是无数个具体反应，是可直接"
				         + "观察的具体行为。较高层是习惯性反应，它是具体反应经重复被固定下来的行为倾向。再高一层是特质，是一组习惯性反应"
				         + "的有机组合，如焦虑、固执等。最高一层是类型，是由一组相关特质的有机组合而成，具有高度概括的特征，对人的行为具"
				         + "有广泛的影响。他通过对人格问卷资料的因素分析研究，确定了人格类型的三个基本维度。根据外倾性维度可以把人格分为"
				         + "外倾型和内倾型；根据情绪稳定性可以把人格分为情绪型和稳定型；根据心理变态倾向可以把人格分为精神失调型和精神整合性。");
		System.out.println();
		
		System.out.println("请输入1并按Enter开始测试，输入其它数值并按Enter退出测试。");
		int imp1=sca.nextInt();
		if(imp1==1) {
			System.out.println();	
		}else {
			System.exit(0);
		}
		
		System.out.println("请您回答以下85个问题，回答问题时不必过多思考。符合您时输入1，不符合时输入0并按Enter键进行下一题。");
		System.out.println();
		
		//给出85道题并接收答案（1为符合，0为不符合）
		do{
			System.out.println("1.你是否有广泛的爱好？");
			System.out.println("1为符合，0为不符合");
			q1=sca.nextInt();
		}while(q1<0 || q1>1);
		System.out.println();
		do{
			System.out.println("2.在做任何事之前，你是否都要考虑一番？");
			System.out.println("1为符合，0为不符合");
			q2=sca.nextInt();
		}while(q2<0 || q2>1);
		System.out.println();
		do{
			System.out.println("3.你的情绪时常波动吗？");
			System.out.println("1为符合，0为不符合");
			q3=sca.nextInt();
		}while(q3<0 || q3>1);
		System.out.println();
		do{
			System.out.println("4.当别人做了好事，而周围人认为是你做的时候，你是否感到洋洋得意？");
			System.out.println("1为符合，0为不符合");
			q4=sca.nextInt();
		}while(q4<0 || q4>1);
		System.out.println();
		do{
			System.out.println("5.你是一个健谈的人吗？");
			System.out.println("1为符合，0为不符合");
			q5=sca.nextInt();
		}while(q5<0 || q5>1);
		System.out.println();
		do{
			System.out.println("6.你曾经无缘无故地觉得自己“可怜”吗？");
			System.out.println("1为符合，0为不符合");
			q6=sca.nextInt();
		}while(q6<0 || q6>1);
		System.out.println();
		do{
			System.out.println("7.你曾经有过贪心使自己多得分外的物质利益吗？");
			System.out.println("1为符合，0为不符合");
			q7=sca.nextInt();
		}while(q7<0 || q7>1);
		System.out.println();
		do{
			System.out.println("8.晚上你是否小心地把门锁好？");
			System.out.println("1为符合，0为不符合");
			q8=sca.nextInt();
		}while(q8<0 || q8>1);
		System.out.println();
		do{
			System.out.println("9.你认为自己活泼吗？");
			System.out.println("1为符合，0为不符合");
			q9=sca.nextInt();
		}while(q9<0 || q9>1);
		System.out.println();
		do{
			System.out.println("10.当你看到小孩（或动物）受折磨时是否感受到难受？");
			System.out.println("1为符合，0为不符合");
			q10=sca.nextInt();
		}while(q10<0 || q10>1);
		System.out.println();
		do{
			System.out.println("11.你是否常担心你会说出（或做出）不应该说或做的事？");
			System.out.println("1为符合，0为不符合");
			q11=sca.nextInt();
		}while(q11<0 || q11>1);
		System.out.println();
		do{
			System.out.println("12.若你说过要做某件事，是否不管遇到什么困难都要把它做成？");
			System.out.println("1为符合，0为不符合");
			q12=sca.nextInt();
		}while(q12<0 || q12>1);
		System.out.println();
		do{
			System.out.println("13.在愉快的聚会中你是否通常尽情享受？");
			System.out.println("1为符合，0为不符合");
			q13=sca.nextInt();
		}while(q13<0 || q13>1);
		System.out.println();
		do{
			System.out.println("14.你是一位易怒的人吗？");
			System.out.println("1为符合，0为不符合");
			q14=sca.nextInt();
		}while(q14<0 || q14>1);
		System.out.println();
		do{
			System.out.println("15.你是否有过自己做错了事反倒责备别人的时候？");
			System.out.println("1为符合，0为不符合");
			q15=sca.nextInt();
		}while(q15<0 || q15>1);
		System.out.println();
		do{
			System.out.println("16.你喜欢会见陌生人吗？");
			System.out.println("1为符合，0为不符合");
			q16=sca.nextInt();
		}while(q16<0 || q16>1);
		System.out.println();
		do{
			System.out.println("17.你是否相信参加储蓄是一种好方法？");
			System.out.println("1为符合，0为不符合");
			q17=sca.nextInt();
		}while(q17<0 || q17>1);
		System.out.println();
		do{
			System.out.println("18.你的感情是否容易受到伤害？");
			System.out.println("1为符合，0为不符合");
			q18=sca.nextInt();
		}while(q18<0 || q18>1);
		System.out.println();
		do{
			System.out.println("19.你是否服用有奇特效果或是有危险性的药物？");
			System.out.println("1为符合，0为不符合");
			q19=sca.nextInt();
		}while(q19<0 || q19>1);
		System.out.println();
		do{
			System.out.println("20.你是否时常感到“极其厌烦”？");
			System.out.println("1为符合，0为不符合");
			q20=sca.nextInt();
		}while(q20<0 || q20>1);
		System.out.println();
		do{
			System.out.println("21.你曾多占多得别人的东西（甚至一针一线）吗？");
			System.out.println("1为符合，0为不符合");
			q21=sca.nextInt();
		}while(q21<0 || q21>1);
		System.out.println();
		do{
			System.out.println("22.如果条件允许，你喜欢经常外出（旅行）吗？");
			System.out.println("1为符合，0为不符合");
			q22=sca.nextInt();
		}while(q22<0 || q22>1);
		System.out.println();
		do{
			System.out.println("23.对你所喜欢的人，你是否为取乐开过过头的玩笑？");
			System.out.println("1为符合，0为不符合");
			q23=sca.nextInt();
		}while(q23<0 || q23>1);
		System.out.println();
		do{
			System.out.println("24.你是否常因“自罪感”而烦恼？");
			System.out.println("1为符合，0为不符合");
			q24=sca.nextInt();
		}while(q24<0 || q24>1);
		System.out.println();
		do{
			System.out.println("25.你是否有时候谈论一些你毫无所知的事情？");
			System.out.println("1为符合，0为不符合");
			q25=sca.nextInt();
		}while(q25<0 || q25>1);
		System.out.println();
		do{
			System.out.println("26.你是否宁愿看些书，也不想去会见别人？");
			System.out.println("1为符合，0为不符合");
			q26=sca.nextInt();
		}while(q26<0 || q26>1);
		System.out.println();
		do{
			System.out.println("27.有坏人想要害你吗？");
			System.out.println("1为符合，0为不符合");
			q27=sca.nextInt();
		}while(q27<0 || q27>1);
		System.out.println();
		do{
			System.out.println("28.你认为自己“神经过敏”吗？");
			System.out.println("1为符合，0为不符合");
			q28=sca.nextInt();
		}while(q28<0 || q28>1);
		System.out.println();
		do{
			System.out.println("29.你的朋友多吗？");
			System.out.println("1为符合，0为不符合");
			q29=sca.nextInt();
		}while(q29<0 || q29>1);
		System.out.println();
		do{
			System.out.println("30.你是个忧虑重重的人吗？");
			System.out.println("1为符合，0为不符合");
			q30=sca.nextInt();
		}while(q30<0 || q30>1);
		System.out.println();
		do{
			System.out.println("31.你在儿童时代是否立即听从大人的吩咐而毫无怨言？");
			System.out.println("1为符合，0为不符合");
			q31=sca.nextInt();
		}while(q31<0 || q31>1);
		System.out.println();
		do{
			System.out.println("32.你是一个无忧无虑逍遥自在的人吗？");
			System.out.println("1为符合，0为不符合");
			q32=sca.nextInt();
		}while(q32<0 || q32>1);
		System.out.println();
		do{
			System.out.println("33.有礼貌爱整洁对你很重要吗？");
			System.out.println("1为符合，0为不符合");
			q33=sca.nextInt();
		}while(q33<0 || q33>1);
		System.out.println();
		do{
			System.out.println("34.你是否担心将会发生可怕的事情？");
			System.out.println("1为符合，0为不符合");
			q34=sca.nextInt();
		}while(q34<0 || q34>1);
		System.out.println();
		do{
			System.out.println("35.在结识新朋友时，你通常是主动的吗？");
			System.out.println("1为符合，0为不符合");
			q35=sca.nextInt();
		}while(q35<0 || q35>1);
		System.out.println();
		do{
			System.out.println("36.你觉得自己是个非常敏感的人吗？");
			System.out.println("1为符合，0为不符合");
			q36=sca.nextInt();
		}while(q36<0 || q36>1);
		System.out.println();
		do{
			System.out.println("37.和别人在一起时，你是否不常说话？");
			System.out.println("1为符合，0为不符合");
			q37=sca.nextInt();
		}while(q37<0 || q37>1);
		System.out.println();
		do{
			System.out.println("38.你是否认为结婚是个框框，应该废除？");
			System.out.println("1为符合，0为不符合");
			q38=sca.nextInt();
		}while(q38<0 || q38>1);
		System.out.println();
		do{
			System.out.println("39.你有时候自吹自擂吗？");
			System.out.println("1为符合，0为不符合");
			q39=sca.nextInt();
		}while(q39<0 || q39>1);
		System.out.println();
		do{
			System.out.println("40.在一个沉闷的场合，你能给大家增添生气吗？");
			System.out.println("1为符合，0为不符合");
			q40=sca.nextInt();
		}while(q40<0 || q40>1);
		System.out.println();
		do{
			System.out.println("41.慢腾腾开车的司机是否使你讨厌？");
			System.out.println("1为符合，0为不符合");
			q41=sca.nextInt();
		}while(q41<0 || q41>1);
		System.out.println();
		do{
			System.out.println("42.你担心自己的健康吗？");
			System.out.println("1为符合，0为不符合");
			q42=sca.nextInt();
		}while(q42<0 || q42>1);
		System.out.println();
		do{
			System.out.println("43.你是否喜欢说笑话和谈论有趣的事情？");
			System.out.println("1为符合，0为不符合");
			q43=sca.nextInt();
		}while(q43<0 || q43>1);
		System.out.println();
		do{
			System.out.println("44.你是否觉得大多数事情对你都是无所谓的？");
			System.out.println("1为符合，0为不符合");
			q44=sca.nextInt();
		}while(q44<0 || q44>1);
		System.out.println();
		do{
			System.out.println("45.你小时候有过对父母鲁莽无礼的时候吗？");
			System.out.println("1为符合，0为不符合");
			q45=sca.nextInt();
		}while(q45<0 || q45>1);
		System.out.println();
		do{
			System.out.println("46.你喜欢和别人打成一片，整天相处在一起吗？");
			System.out.println("1为符合，0为不符合");
			q46=sca.nextInt();
		}while(q46<0 || q46>1);
		System.out.println();
		do{
			System.out.println("47.你失眠吗？");
			System.out.println("1为符合，0为不符合");
			q47=sca.nextInt();
		}while(q47<0 || q47>1);
		System.out.println();
		do{
			System.out.println("48.你饭前必定洗手吗？");
			System.out.println("1为符合，0为不符合");
			q48=sca.nextInt();
		}while(q48<0 || q48>1);
		System.out.println();
		do{
			System.out.println("49.当别人问你话时，你是否对答如流？");
			System.out.println("1为符合，0为不符合");
			q49=sca.nextInt();
		}while(q49<0 || q49>1);
		System.out.println();
		do{
			System.out.println("50.你是否宁愿有富裕的时间，喜欢早点动身去赴约会？");
			System.out.println("1为符合，0为不符合");
			q50=sca.nextInt();
		}while(q50<0 || q50>1);
		System.out.println();
		do{
			System.out.println("51.你经常无缘无故感到疲倦和无精打采吗？");
			System.out.println("1为符合，0为不符合");
			q51=sca.nextInt();
		}while(q51<0 || q51>1);
		System.out.println();
		do{
			System.out.println("52.在游戏或打牌时你曾经作弊过吗？");
			System.out.println("1为符合，0为不符合");
			q52=sca.nextInt();
		}while(q52<0 || q52>1);
		System.out.println();
		do{
			System.out.println("53.你喜欢紧张的工作吗？");
			System.out.println("1为符合，0为不符合");
			q53=sca.nextInt();
		}while(q53<0 || q53>1);
		System.out.println();
		do{
			System.out.println("54.你时常觉得自己的生活很单调吗？");
			System.out.println("1为符合，0为不符合");
			q54=sca.nextInt();
		}while(q54<0 || q54>1);
		System.out.println();
		do{
			System.out.println("55.你曾经为了自己而利用别人吗？");
			System.out.println("1为符合，0为不符合");
			q55=sca.nextInt();
		}while(q55<0 || q55>1);
		System.out.println();
		do{
			System.out.println("56.你是否参加的活动太多，已经超过自己可能分配的时间？");
			System.out.println("1为符合，0为不符合");
			q56=sca.nextInt();
		}while(q56<0 || q56>1);
		System.out.println();
		do{
			System.out.println("57.是否有那么几个人时常躲着你？");
			System.out.println("1为符合，0为不符合");
			q57=sca.nextInt();
		}while(q57<0 || q57>1);
		System.out.println();
		do{
			System.out.println("58.你是否认为人们为保障自己的将来而精打细算、勤俭节约所费的时间太多了？");
			System.out.println("1为符合，0为不符合");
			q58=sca.nextInt();
		}while(q58<0 || q58>1);
		System.out.println();
		do{
			System.out.println("59.你是否曾想过去死？");
			System.out.println("1为符合，0为不符合");
			q59=sca.nextInt();
		}while(q59<0 || q59>1);
		System.out.println();
		do{
			System.out.println("60.若你确知不会被发现时，你会少付给人家钱吗？");
			System.out.println("1为符合，0为不符合");
			q60=sca.nextInt();
		}while(q60<0 || q60>1);
		System.out.println();
		do{
			System.out.println("61.你能使一个联欢会开的成功吗？");
			System.out.println("1为符合，0为不符合");
			q61=sca.nextInt();
		}while(q61<0 || q61>1);
		System.out.println();
		do{
			System.out.println("62.你是否尽力使自己不粗鲁？");
			System.out.println("1为符合，0为不符合");
			q62=sca.nextInt();
		}while(q62<0 || q62>1);
		System.out.println();
		do{
			System.out.println("63.一件使你为难的事过去之后，是否使你烦恼好久？");
			System.out.println("1为符合，0为不符合");
			q63=sca.nextInt();
		}while(q63<0 || q63>1);
		System.out.println();
		do{
			System.out.println("64.你是否坚持要照你的想法去办事？");
			System.out.println("1为符合，0为不符合");
			q64=sca.nextInt();
		}while(q64<0 || q64>1);
		System.out.println();
		do{
			System.out.println("65.当你去乘火车时，你是否最后一分钟到达？");
			System.out.println("1为符合，0为不符合");
			q65=sca.nextInt();
		}while(q65<0 || q65>1);
		System.out.println();
		do{
			System.out.println("66.你是否容易紧张？");
			System.out.println("1为符合，0为不符合");
			q66=sca.nextInt();
		}while(q66<0 || q66>1);
		System.out.println();
		do{
			System.out.println("67.你时常感到寂寞吗？");
			System.out.println("1为符合，0为不符合");
			q67=sca.nextInt();
		}while(q67<0 || q67>1);
		System.out.println();
		do{
			System.out.println("68.你的言行总是一致吗？");
			System.out.println("1为符合，0为不符合");
			q68=sca.nextInt();
		}while(q68<0 || q68>1);
		System.out.println();
		do{
			System.out.println("69.你有时喜欢玩弄动物吗？");
			System.out.println("1为符合，0为不符合");
			q69=sca.nextInt();
		}while(q69<0 || q69>1);
		System.out.println();
		do{
			System.out.println("70.有人对你或对你的工作吹毛求疵时，是否容易伤害到你的积极性？");
			System.out.println("1为符合，0为不符合");
			q70=sca.nextInt();
		}while(q70<0 || q70>1);
		System.out.println();
		do{
			System.out.println("71.你去赴约会或上班时，曾否迟到？");
			System.out.println("1为符合，0为不符合");
			q71=sca.nextInt();
		}while(q71<0 || q71>1);
		System.out.println();
		do{
			System.out.println("72.你是否喜欢在你的周围有许多热闹和高兴的事？");
			System.out.println("1为符合，0为不符合");
			q72=sca.nextInt();
		}while(q72<0 || q72>1);
		System.out.println();
		do{
			System.out.println("73.你愿意让别人怕你吗？");
			System.out.println("1为符合，0为不符合");
			q73=sca.nextInt();
		}while(q73<0 || q73>1);
		System.out.println();
		do{
			System.out.println("74.你是否有时兴致勃勃，有时却懒散不想动弹？");
			System.out.println("1为符合，0为不符合");
			q74=sca.nextInt();
		}while(q74<0 || q74>1);
		System.out.println();
		do{
			System.out.println("75.你有时会把今天应该做的事拖到明天吗？");
			System.out.println("1为符合，0为不符合");
			q75=sca.nextInt();
		}while(q75<0 || q75>1);
		System.out.println();
		do{
			System.out.println("76.别人是否认为你是生气勃勃的？");
			System.out.println("1为符合，0为不符合");
			q76=sca.nextInt();
		}while(q76<0 || q76>1);
		System.out.println();
		do{
			System.out.println("77.别人是否对你说过许多谎话？");
			System.out.println("1为符合，0为不符合");
			q77=sca.nextInt();
		}while(q77<0 || q77>1);
		System.out.println();
		do{
			System.out.println("78.你是否对有些事情易性急生气？");
			System.out.println("1为符合，0为不符合");
			q78=sca.nextInt();
		}while(q78<0 || q78>1);
		System.out.println();
		do{
			System.out.println("79.若你犯错误你是否愿意承认？");
			System.out.println("1为符合，0为不符合");
			q79=sca.nextInt();
		}while(q79<0 || q79>1);
		System.out.println();
		do{
			System.out.println("80.你是一个严谨、有条不素的人吗？");
			System.out.println("1为符合，0为不符合");
			q80=sca.nextInt();
		}while(q80<0 || q80>1);
		System.out.println();
		do{
			System.out.println("81.在公园或马路上，你是否总把果皮或废纸扔到垃圾箱里？");
			System.out.println("1为符合，0为不符合");
			q81=sca.nextInt();
		}while(q81<0 || q81>1);
		System.out.println();
		do{
			System.out.println("82.遇到为难的事情你是否拿不定主意？");
			System.out.println("1为符合，0为不符合");
			q82=sca.nextInt();
		}while(q82<0 || q82>1);
		System.out.println();
		do{
			System.out.println("83.你是否有过随口骂人的时候？");
			System.out.println("1为符合，0为不符合");
			q83=sca.nextInt();
		}while(q83<0 || q83>1);
		System.out.println();
		do{
			System.out.println("84.你若乘车或飞机外出时，你是否担心会碰撞或出意外？");
			System.out.println("1为符合，0为不符合");
			q84=sca.nextInt();
		}while(q84<0 || q84>1);
		System.out.println();
		do{
			System.out.println("85.你是一个爱交往的人吗？");
			System.out.println("1为符合，0为不符合");
			q85=sca.nextInt();
		}while(q85<0 || q85>1);
		System.out.println();
		
		
		//处理用户的答案
		/*
		 * E量表：外向-内向。
		 * 第1、5、9、13、16、22、29、32、35、40、43、46、49、53、56、61、72、76、85题答符合（1），
		 * 第26、37题答不符合（0），每题各得一分。
		 */
		int Eq26;
		if(q26==0) { 
			Eq26=1;
		}else {
			Eq26=0;
		}
		int Eq37;
		if(q37==0) {
			Eq37=1;
		}else {
			Eq37=0;
		}
		int E=q1+q5+q9+q13+q16+q22+q29+q32+q35+q40+q43+q46+q49+q53+q56+q61+q72+q76+q85+Eq26+Eq37;
		
		/*
		 * N量表：神经质（又称情绪性）。
		 * 第3、6、11、14、18、20、24、28、30、34、36、42、47、51、54、59、63、66、67、70、74、78、82、84题答符合（1），每题各得一分。
		 */
		int N=q3+q6+q11+q14+q18+q20+q24+q28+q30+q34+q36+q42+q47+q51+q54+q59+q63+q66+q67+q70+q74+q78+q82+q84;
		
		/*
		 * P量表：精神质（又称倔强）。
		 * 第19、23、27、38、41、44、57、58、65、69、73、77题答符合（1），
		 * 第2、8、10、17、33、50、62、80题答不符合（0），每题各得一分。
		 */
		int Pq2;
		if(q2==0) {
			Pq2=1;
		}else {
			Pq2=0;
		}
		int Pq8;
		if(q8==0) {
			Pq8=1;
		}else {
			Pq8=0;
		}
		int Pq10;
		if(q10==0) {
			Pq10=1;
		}else {
			Pq10=0;
		}
		int Pq17;
		if(q17==0) {
			Pq17=1;
		}else {
			Pq17=0;
		}
		int Pq33;
		if(q33==0) {
			Pq33=1;
		}else {
			Pq33=0;
		}
		int Pq50;
		if(q50==0) {
			Pq50=1;
		}else {
			Pq50=0;
		}
		int Pq62;
		if(q62==0) {
			Pq62=1;
		}else {
			Pq62=0;
		}
		int Pq80;
		if(q80==0) {
			Pq80=1;
		}else {
			Pq80=0;
		}
		int P=q19+q23+q27+q38+q41+q44+q57+q58+q65+q69+q73+q77+Pq2+Pq8+Pq10+Pq17+Pq33+Pq50+Pq62+Pq80;
		
		/*
		 * L量表：测定被试的掩饰、假托或自身隐蔽，或者测定其朴实、幼稚水平。
		 * 第12、31、48、68、79、81题答符合（1），
		 * 第4、7、15、21、25、39、45、52、55、60、64、71、75、83题答不符合（0），每题各得一分。
		 */
		int Lq4;
		if(q4==0) {
			Lq4=1;
		}else {
			Lq4=0;
		}
		int Lq7;
		if(q7==0) {
			Lq7=1;
		}else {
			Lq7=0;
		}
		int Lq15;
		if(q15==0) {
			Lq15=1;
		}else {
			Lq15=0;
		}
		int Lq21;
		if(q21==0) {
			Lq21=1;
		}else {
			Lq21=0;
		}
		int Lq25;
		if(q25==0) {
			Lq25=1;
		}else {
			Lq25=0;
		}
		int Lq39;
		if(q39==0) {
			Lq39=1;
		}else {
			Lq39=0;
		}
		int Lq45;
		if(q45==0) {
			Lq45=1;
		}else {
			Lq45=0;
		}
		int Lq52;
		if(q52==0) {
			Lq52=1;
		}else {
			Lq52=0;
		}
		int Lq55;
		if(q55==0) {
			Lq55=1;
		}else {
			Lq55=0;
		}
		int Lq60;
		if(q60==0) {
			Lq60=1;
		}else {
			Lq60=0;
		}
		int Lq64;
		if(q64==0) {
			Lq64=1;
		}else {
			Lq64=0;
		}
		int Lq71;
		if(q71==0) {
			Lq71=1;
		}else {
			Lq71=0;
		}
		int Lq75;
		if(q75==0) {
			Lq75=1;
		}else {
			Lq75=0;
		}
		int Lq83;
		if(q83==0) {
			Lq83=1;
		}else {
			Lq83=0;
		}
		int L=q12+q31+q48+q68+q79+q81+Lq4+Lq7+Lq15+Lq21+Lq25+Lq39+Lq45+Lq52+Lq55+Lq60+Lq64+Lq71+Lq75+Lq83;
		System.out.println();
		
		
		//汇总用户的答案
		System.out.println("*****您的测试结果*****");
		
		//L量表：分数如果高于18分，显示被测者有掩饰倾向，测试结果可能失真。
		if(L>18) {
			System.out.println("您有掩饰倾向，测试结果可能失真。");		
		}else {
			System.out.print("");
		}
		System.out.println();
		
		//E量表：分数高于15分表示性格外向，可能是好交际，渴望刺激和冒险，感情易于冲动。分数低于8分，表示人格内向，可能好静，富于内省，不喜欢刺激，喜欢有秩序的生活方式，情绪比较稳定。
		System.out.println("您的E量表（外向-内向）测试结果为：");
		if(E>15) {
			System.out.println("您的性格外向，可能是好交际，渴望刺激和冒险，感情易于冲动。");
		}else if(E<8) {
			System.out.println("您的性格内向，可能好静，富于内省，不喜欢刺激，喜欢有秩序的生活方式，情绪比较稳定。");
		}else {
			System.out.println("您的性格介于外向与内向之间。");
		}
		System.out.println();
		
		//N量表：分数高于14分表示焦虑、忧心忡忡、常郁郁不乐，有强烈情绪反应，甚至出现不够理智的行为。低于9分表示情绪稳定。
		System.out.println("您的N量表（神经质，又称情绪性）测试结果为：");
		if(N>14) {
			System.out.println("您可能焦虑、忧心忡忡、常郁郁不乐，有强烈情绪反应，甚至出现不够理智的行为。");
		}else if(N<9) {
			System.out.println("您平时的情绪稳定。");
		}else {
			System.out.println("您平时的情绪比较稳定。");
		}
		
		//P量表：分数高于8分表示可能是孤独，不关心他人，难以适应外部环境，不近人情，与别人不友好，喜欢干奇特的事情，并且不顾危险。
		if(P>8) {
			System.out.println();
			System.out.println("您的P量表（精神质，又称倔强）测试结果为：");
			System.out.println("您可能孤独，不关心他人，难以适应外部环境，不近人情，与别人不友好，喜欢干奇特的事情，并且不顾危险。");
		}else {
			System.out.print("");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("*****测试结束*****");
		System.out.println();
		System.out.println("感谢您进行测试，本程序由Java语言编写。作者初学Java，如有不足请谅解并欢迎指出。欢迎交流与反馈Bug，作者邮箱：Ruixe1569898391@outlook.com。");
		System.out.println();
		
		int imp2;
		int sth=0;
		do {
			System.out.println("输入1并按Enter停留在该窗口继续查看测试结果，输入其它数值并按Enter退出测试。");
			imp2=sca.nextInt();
			sth++;
			if(sth==5) {
				System.out.println();
				System.out.println("*****恭喜你发现了这个没什么用的彩蛋*****");
				System.out.println();
			}else if(sth==10){
				System.out.println();
				System.out.println("   还要继续吗？");
				System.out.println();
			}else if(sth==20){
				System.out.println();
				System.out.println("   真的没有了哦。");
				System.out.println();
			}
		}while(imp2==1);
		
		sca.close();		//关闭Scanner对象sca
		
	}

}
