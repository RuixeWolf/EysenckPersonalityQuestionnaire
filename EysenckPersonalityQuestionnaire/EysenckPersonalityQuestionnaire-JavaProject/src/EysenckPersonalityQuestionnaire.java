import java.util.Scanner;
public class EysenckPersonalityQuestionnaire {

	public static void main(String[] args) {

		//����85����𰸵ı���
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
		System.out.println("*****��ӭ���а�ɭ���˸��ʾ����*****");
		System.out.println();
		System.out.println("    ��ɭ���˸�����(Eysenck's personality theory)Ӣ������ѧ��H��J����ɭ����������˸�ṹ�㼶˵����ά���˸�����"
				         + "˵Ϊ��Ҫ���ݵ��˸����ۡ�����Ϊ���˸�������Ϊ����ΪȺ�л���֯���ɵĲ㼶�ṹ����Ͳ������������巴Ӧ���ǿ�ֱ��"
				         + "�۲�ľ�����Ϊ���ϸ߲���ϰ���Է�Ӧ�����Ǿ��巴Ӧ���ظ����̶���������Ϊ�����ٸ�һ�������ʣ���һ��ϰ���Է�Ӧ"
				         + "���л���ϣ��罹�ǡ���ִ�ȡ����һ�������ͣ�����һ��������ʵ��л���϶��ɣ����и߶ȸ��������������˵���Ϊ��"
				         + "�й㷺��Ӱ�졣��ͨ�����˸��ʾ����ϵ����ط����о���ȷ�����˸����͵���������ά�ȡ�����������ά�ȿ��԰��˸��Ϊ"
				         + "�����ͺ������ͣ����������ȶ��Կ��԰��˸��Ϊ�����ͺ��ȶ��ͣ����������̬������԰��˸��Ϊ����ʧ���ͺ;��������ԡ�");
		System.out.println();
		
		System.out.println("������1����Enter��ʼ���ԣ�����������ֵ����Enter�˳����ԡ�");
		int imp1=sca.nextInt();
		if(imp1==1) {
			System.out.println();	
		}else {
			System.exit(0);
		}
		
		System.out.println("�����ش�����85�����⣬�ش�����ʱ���ع���˼����������ʱ����1��������ʱ����0����Enter��������һ�⡣");
		System.out.println();
		
		//����85���Ⲣ���մ𰸣�1Ϊ���ϣ�0Ϊ�����ϣ�
		do{
			System.out.println("1.���Ƿ��й㷺�İ��ã�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q1=sca.nextInt();
		}while(q1<0 || q1>1);
		System.out.println();
		do{
			System.out.println("2.�����κ���֮ǰ�����Ƿ�Ҫ����һ����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q2=sca.nextInt();
		}while(q2<0 || q2>1);
		System.out.println();
		do{
			System.out.println("3.�������ʱ��������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q3=sca.nextInt();
		}while(q3<0 || q3>1);
		System.out.println();
		do{
			System.out.println("4.���������˺��£�����Χ����Ϊ��������ʱ�����Ƿ�е�������⣿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q4=sca.nextInt();
		}while(q4<0 || q4>1);
		System.out.println();
		do{
			System.out.println("5.����һ����̸������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q5=sca.nextInt();
		}while(q5<0 || q5>1);
		System.out.println();
		do{
			System.out.println("6.��������Ե�޹ʵؾ����Լ�����������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q6=sca.nextInt();
		}while(q6<0 || q6>1);
		System.out.println();
		do{
			System.out.println("7.�������й�̰��ʹ�Լ���÷��������������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q7=sca.nextInt();
		}while(q7<0 || q7>1);
		System.out.println();
		do{
			System.out.println("8.�������Ƿ�С�ĵذ������ã�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q8=sca.nextInt();
		}while(q8<0 || q8>1);
		System.out.println();
		do{
			System.out.println("9.����Ϊ�Լ�������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q9=sca.nextInt();
		}while(q9<0 || q9>1);
		System.out.println();
		do{
			System.out.println("10.���㿴��С�����������ĥʱ�Ƿ���ܵ����ܣ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q10=sca.nextInt();
		}while(q10<0 || q10>1);
		System.out.println();
		do{
			System.out.println("11.���Ƿ񳣵������˵��������������Ӧ��˵�������£�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q11=sca.nextInt();
		}while(q11<0 || q11>1);
		System.out.println();
		do{
			System.out.println("12.����˵��Ҫ��ĳ���£��Ƿ񲻹�����ʲô���Ѷ�Ҫ�������ɣ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q12=sca.nextInt();
		}while(q12<0 || q12>1);
		System.out.println();
		do{
			System.out.println("13.�����ľۻ������Ƿ�ͨ���������ܣ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q13=sca.nextInt();
		}while(q13<0 || q13>1);
		System.out.println();
		do{
			System.out.println("14.����һλ��ŭ������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q14=sca.nextInt();
		}while(q14<0 || q14>1);
		System.out.println();
		do{
			System.out.println("15.���Ƿ��й��Լ��������·����𱸱��˵�ʱ��");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q15=sca.nextInt();
		}while(q15<0 || q15>1);
		System.out.println();
		do{
			System.out.println("16.��ϲ�����İ������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q16=sca.nextInt();
		}while(q16<0 || q16>1);
		System.out.println();
		do{
			System.out.println("17.���Ƿ����ŲμӴ�����һ�ֺ÷�����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q17=sca.nextInt();
		}while(q17<0 || q17>1);
		System.out.println();
		do{
			System.out.println("18.��ĸ����Ƿ������ܵ��˺���");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q18=sca.nextInt();
		}while(q18<0 || q18>1);
		System.out.println();
		do{
			System.out.println("19.���Ƿ����������Ч��������Σ���Ե�ҩ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q19=sca.nextInt();
		}while(q19<0 || q19>1);
		System.out.println();
		do{
			System.out.println("20.���Ƿ�ʱ���е��������ᷳ����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q20=sca.nextInt();
		}while(q20<0 || q20>1);
		System.out.println();
		do{
			System.out.println("21.������ռ��ñ��˵Ķ���������һ��һ�ߣ���");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q21=sca.nextInt();
		}while(q21<0 || q21>1);
		System.out.println();
		do{
			System.out.println("22.�������������ϲ��������������У���");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q22=sca.nextInt();
		}while(q22<0 || q22>1);
		System.out.println();
		do{
			System.out.println("23.������ϲ�����ˣ����Ƿ�Ϊȡ�ֿ�����ͷ����Ц��");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q23=sca.nextInt();
		}while(q23<0 || q23>1);
		System.out.println();
		do{
			System.out.println("24.���Ƿ�������С������գ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q24=sca.nextInt();
		}while(q24<0 || q24>1);
		System.out.println();
		do{
			System.out.println("25.���Ƿ���ʱ��̸��һЩ�������֪�����飿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q25=sca.nextInt();
		}while(q25<0 || q25>1);
		System.out.println();
		do{
			System.out.println("26.���Ƿ���Ը��Щ�飬Ҳ����ȥ������ˣ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q26=sca.nextInt();
		}while(q26<0 || q26>1);
		System.out.println();
		do{
			System.out.println("27.�л�����Ҫ������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q27=sca.nextInt();
		}while(q27<0 || q27>1);
		System.out.println();
		do{
			System.out.println("28.����Ϊ�Լ����񾭹�������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q28=sca.nextInt();
		}while(q28<0 || q28>1);
		System.out.println();
		do{
			System.out.println("29.������Ѷ���");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q29=sca.nextInt();
		}while(q29<0 || q29>1);
		System.out.println();
		do{
			System.out.println("30.���Ǹ��������ص�����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q30=sca.nextInt();
		}while(q30<0 || q30>1);
		System.out.println();
		do{
			System.out.println("31.���ڶ�ͯʱ���Ƿ��������Ӵ��˵ķԸ�������Թ�ԣ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q31=sca.nextInt();
		}while(q31<0 || q31>1);
		System.out.println();
		do{
			System.out.println("32.����һ������������ң���ڵ�����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q32=sca.nextInt();
		}while(q32<0 || q32>1);
		System.out.println();
		do{
			System.out.println("33.����ò������������Ҫ��");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q33=sca.nextInt();
		}while(q33<0 || q33>1);
		System.out.println();
		do{
			System.out.println("34.���Ƿ��Ľ��ᷢ�����µ����飿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q34=sca.nextInt();
		}while(q34<0 || q34>1);
		System.out.println();
		do{
			System.out.println("35.�ڽ�ʶ������ʱ����ͨ������������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q35=sca.nextInt();
		}while(q35<0 || q35>1);
		System.out.println();
		do{
			System.out.println("36.������Լ��Ǹ��ǳ����е�����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q36=sca.nextInt();
		}while(q36<0 || q36>1);
		System.out.println();
		do{
			System.out.println("37.�ͱ�����һ��ʱ�����Ƿ񲻳�˵����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q37=sca.nextInt();
		}while(q37<0 || q37>1);
		System.out.println();
		do{
			System.out.println("38.���Ƿ���Ϊ����Ǹ����Ӧ�÷ϳ���");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q38=sca.nextInt();
		}while(q38<0 || q38>1);
		System.out.println();
		do{
			System.out.println("39.����ʱ���Դ�������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q39=sca.nextInt();
		}while(q39<0 || q39>1);
		System.out.println();
		do{
			System.out.println("40.��һ�����Ƶĳ��ϣ����ܸ��������������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q40=sca.nextInt();
		}while(q40<0 || q40>1);
		System.out.println();
		do{
			System.out.println("41.�����ڿ�����˾���Ƿ�ʹ�����᣿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q41=sca.nextInt();
		}while(q41<0 || q41>1);
		System.out.println();
		do{
			System.out.println("42.�㵣���Լ��Ľ�����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q42=sca.nextInt();
		}while(q42<0 || q42>1);
		System.out.println();
		do{
			System.out.println("43.���Ƿ�ϲ��˵Ц����̸����Ȥ�����飿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q43=sca.nextInt();
		}while(q43<0 || q43>1);
		System.out.println();
		do{
			System.out.println("44.���Ƿ���ô����������㶼������ν�ģ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q44=sca.nextInt();
		}while(q44<0 || q44>1);
		System.out.println();
		do{
			System.out.println("45.��Сʱ���й��Ը�ĸ³ç�����ʱ����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q45=sca.nextInt();
		}while(q45<0 || q45>1);
		System.out.println();
		do{
			System.out.println("46.��ϲ���ͱ��˴��һƬ�������ദ��һ����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q46=sca.nextInt();
		}while(q46<0 || q46>1);
		System.out.println();
		do{
			System.out.println("47.��ʧ����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q47=sca.nextInt();
		}while(q47<0 || q47>1);
		System.out.println();
		do{
			System.out.println("48.�㷹ǰ�ض�ϴ����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q48=sca.nextInt();
		}while(q48<0 || q48>1);
		System.out.println();
		do{
			System.out.println("49.���������㻰ʱ�����Ƿ�Դ�������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q49=sca.nextInt();
		}while(q49<0 || q49>1);
		System.out.println();
		do{
			System.out.println("50.���Ƿ���Ը�и�ԣ��ʱ�䣬ϲ����㶯��ȥ��Լ�᣿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q50=sca.nextInt();
		}while(q50<0 || q50>1);
		System.out.println();
		do{
			System.out.println("51.�㾭����Ե�޹ʸе�ƣ����޾������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q51=sca.nextInt();
		}while(q51<0 || q51>1);
		System.out.println();
		do{
			System.out.println("52.����Ϸ�����ʱ���������׹���");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q52=sca.nextInt();
		}while(q52<0 || q52>1);
		System.out.println();
		do{
			System.out.println("53.��ϲ�����ŵĹ�����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q53=sca.nextInt();
		}while(q53<0 || q53>1);
		System.out.println();
		do{
			System.out.println("54.��ʱ�������Լ�������ܵ�����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q54=sca.nextInt();
		}while(q54<0 || q54>1);
		System.out.println();
		do{
			System.out.println("55.������Ϊ���Լ������ñ�����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q55=sca.nextInt();
		}while(q55<0 || q55>1);
		System.out.println();
		do{
			System.out.println("56.���Ƿ�μӵĻ̫�࣬�Ѿ������Լ����ܷ����ʱ�䣿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q56=sca.nextInt();
		}while(q56<0 || q56>1);
		System.out.println();
		do{
			System.out.println("57.�Ƿ�����ô������ʱ�������㣿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q57=sca.nextInt();
		}while(q57<0 || q57>1);
		System.out.println();
		do{
			System.out.println("58.���Ƿ���Ϊ����Ϊ�����Լ��Ľ���������ϸ�㡢�ڼ��Լ���ѵ�ʱ��̫���ˣ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q58=sca.nextInt();
		}while(q58<0 || q58>1);
		System.out.println();
		do{
			System.out.println("59.���Ƿ������ȥ����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q59=sca.nextInt();
		}while(q59<0 || q59>1);
		System.out.println();
		do{
			System.out.println("60.����ȷ֪���ᱻ����ʱ������ٸ����˼�Ǯ��");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q60=sca.nextInt();
		}while(q60<0 || q60>1);
		System.out.println();
		do{
			System.out.println("61.����ʹһ�������Ὺ�ĳɹ���");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q61=sca.nextInt();
		}while(q61<0 || q61>1);
		System.out.println();
		do{
			System.out.println("62.���Ƿ���ʹ�Լ�����³��");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q62=sca.nextInt();
		}while(q62<0 || q62>1);
		System.out.println();
		do{
			System.out.println("63.һ��ʹ��Ϊ�ѵ��¹�ȥ֮���Ƿ�ʹ�㷳�պþã�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q63=sca.nextInt();
		}while(q63<0 || q63>1);
		System.out.println();
		do{
			System.out.println("64.���Ƿ���Ҫ������뷨ȥ���£�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q64=sca.nextInt();
		}while(q64<0 || q64>1);
		System.out.println();
		do{
			System.out.println("65.����ȥ�˻�ʱ�����Ƿ����һ���ӵ��");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q65=sca.nextInt();
		}while(q65<0 || q65>1);
		System.out.println();
		do{
			System.out.println("66.���Ƿ����׽��ţ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q66=sca.nextInt();
		}while(q66<0 || q66>1);
		System.out.println();
		do{
			System.out.println("67.��ʱ���е���į��");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q67=sca.nextInt();
		}while(q67<0 || q67>1);
		System.out.println();
		do{
			System.out.println("68.�����������һ����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q68=sca.nextInt();
		}while(q68<0 || q68>1);
		System.out.println();
		do{
			System.out.println("69.����ʱϲ����Ū������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q69=sca.nextInt();
		}while(q69<0 || q69>1);
		System.out.println();
		do{
			System.out.println("70.���˶�������Ĺ�����ë���ʱ���Ƿ������˺�����Ļ����ԣ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q70=sca.nextInt();
		}while(q70<0 || q70>1);
		System.out.println();
		do{
			System.out.println("71.��ȥ��Լ����ϰ�ʱ������ٵ���");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q71=sca.nextInt();
		}while(q71<0 || q71>1);
		System.out.println();
		do{
			System.out.println("72.���Ƿ�ϲ���������Χ��������ֺ͸��˵��£�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q72=sca.nextInt();
		}while(q72<0 || q72>1);
		System.out.println();
		do{
			System.out.println("73.��Ը���ñ���������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q73=sca.nextInt();
		}while(q73<0 || q73>1);
		System.out.println();
		do{
			System.out.println("74.���Ƿ���ʱ���²�������ʱȴ��ɢ���붯����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q74=sca.nextInt();
		}while(q74<0 || q74>1);
		System.out.println();
		do{
			System.out.println("75.����ʱ��ѽ���Ӧ���������ϵ�������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q75=sca.nextInt();
		}while(q75<0 || q75>1);
		System.out.println();
		do{
			System.out.println("76.�����Ƿ���Ϊ�������������ģ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q76=sca.nextInt();
		}while(q76<0 || q76>1);
		System.out.println();
		do{
			System.out.println("77.�����Ƿ����˵�����ѻ���");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q77=sca.nextInt();
		}while(q77<0 || q77>1);
		System.out.println();
		do{
			System.out.println("78.���Ƿ����Щ�������Լ�������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q78=sca.nextInt();
		}while(q78<0 || q78>1);
		System.out.println();
		do{
			System.out.println("79.���㷸�������Ƿ�Ը����ϣ�");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q79=sca.nextInt();
		}while(q79<0 || q79>1);
		System.out.println();
		do{
			System.out.println("80.����һ���Ͻ����������ص�����");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q80=sca.nextInt();
		}while(q80<0 || q80>1);
		System.out.println();
		do{
			System.out.println("81.�ڹ�԰����·�ϣ����Ƿ��ܰѹ�Ƥ���ֽ�ӵ��������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q81=sca.nextInt();
		}while(q81<0 || q81>1);
		System.out.println();
		do{
			System.out.println("82.����Ϊ�ѵ��������Ƿ��ò������⣿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q82=sca.nextInt();
		}while(q82<0 || q82>1);
		System.out.println();
		do{
			System.out.println("83.���Ƿ��й�������˵�ʱ��");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q83=sca.nextInt();
		}while(q83<0 || q83>1);
		System.out.println();
		do{
			System.out.println("84.�����˳���ɻ����ʱ�����Ƿ��Ļ���ײ������⣿");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q84=sca.nextInt();
		}while(q84<0 || q84>1);
		System.out.println();
		do{
			System.out.println("85.����һ��������������");
			System.out.println("1Ϊ���ϣ�0Ϊ������");
			q85=sca.nextInt();
		}while(q85<0 || q85>1);
		System.out.println();
		
		
		//�����û��Ĵ�
		/*
		 * E��������-����
		 * ��1��5��9��13��16��22��29��32��35��40��43��46��49��53��56��61��72��76��85�����ϣ�1����
		 * ��26��37��𲻷��ϣ�0����ÿ�����һ�֡�
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
		 * N�������ʣ��ֳ������ԣ���
		 * ��3��6��11��14��18��20��24��28��30��34��36��42��47��51��54��59��63��66��67��70��74��78��82��84�����ϣ�1����ÿ�����һ�֡�
		 */
		int N=q3+q6+q11+q14+q18+q20+q24+q28+q30+q34+q36+q42+q47+q51+q54+q59+q63+q66+q67+q70+q74+q78+q82+q84;
		
		/*
		 * P���������ʣ��ֳƾ�ǿ����
		 * ��19��23��27��38��41��44��57��58��65��69��73��77�����ϣ�1����
		 * ��2��8��10��17��33��50��62��80��𲻷��ϣ�0����ÿ�����һ�֡�
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
		 * L�����ⶨ���Ե����Ρ����л��������Σ����߲ⶨ����ʵ������ˮƽ��
		 * ��12��31��48��68��79��81�����ϣ�1����
		 * ��4��7��15��21��25��39��45��52��55��60��64��71��75��83��𲻷��ϣ�0����ÿ�����һ�֡�
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
		
		
		//�����û��Ĵ�
		System.out.println("*****���Ĳ��Խ��*****");
		
		//L���������������18�֣���ʾ���������������򣬲��Խ������ʧ�档
		if(L>18) {
			System.out.println("�����������򣬲��Խ������ʧ�档");		
		}else {
			System.out.print("");
		}
		System.out.println();
		
		//E������������15�ֱ�ʾ�Ը����򣬿����Ǻý��ʣ������̼���ð�գ��������ڳ嶯����������8�֣���ʾ�˸����򣬿��ܺþ���������ʡ����ϲ���̼���ϲ������������ʽ�������Ƚ��ȶ���
		System.out.println("����E��������-���򣩲��Խ��Ϊ��");
		if(E>15) {
			System.out.println("�����Ը����򣬿����Ǻý��ʣ������̼���ð�գ��������ڳ嶯��");
		}else if(E<8) {
			System.out.println("�����Ը����򣬿��ܺþ���������ʡ����ϲ���̼���ϲ������������ʽ�������Ƚ��ȶ���");
		}else {
			System.out.println("�����Ը��������������֮�䡣");
		}
		System.out.println();
		
		//N������������14�ֱ�ʾ���ǡ��������硢���������֣���ǿ��������Ӧ���������ֲ������ǵ���Ϊ������9�ֱ�ʾ�����ȶ���
		System.out.println("����N�������ʣ��ֳ������ԣ����Խ��Ϊ��");
		if(N>14) {
			System.out.println("�����ܽ��ǡ��������硢���������֣���ǿ��������Ӧ���������ֲ������ǵ���Ϊ��");
		}else if(N<9) {
			System.out.println("��ƽʱ�������ȶ���");
		}else {
			System.out.println("��ƽʱ�������Ƚ��ȶ���");
		}
		
		//P������������8�ֱ�ʾ�����ǹ¶������������ˣ�������Ӧ�ⲿ�������������飬����˲��Ѻã�ϲ�������ص����飬���Ҳ���Σ�ա�
		if(P>8) {
			System.out.println();
			System.out.println("����P���������ʣ��ֳƾ�ǿ�����Խ��Ϊ��");
			System.out.println("�����ܹ¶������������ˣ�������Ӧ�ⲿ�������������飬����˲��Ѻã�ϲ�������ص����飬���Ҳ���Σ�ա�");
		}else {
			System.out.print("");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("*****���Խ���*****");
		System.out.println();
		System.out.println("��л�����в��ԣ���������Java���Ա�д�����߳�ѧJava�����в������½Ⲣ��ӭָ������ӭ�����뷴��Bug���������䣺Ruixe1569898391@outlook.com��");
		System.out.println();
		
		int imp2;
		int sth=0;
		do {
			System.out.println("����1����Enterͣ���ڸô��ڼ����鿴���Խ��������������ֵ����Enter�˳����ԡ�");
			imp2=sca.nextInt();
			sth++;
			if(sth==5) {
				System.out.println();
				System.out.println("*****��ϲ�㷢�������ûʲô�õĲʵ�*****");
				System.out.println();
			}else if(sth==10){
				System.out.println();
				System.out.println("   ��Ҫ������");
				System.out.println();
			}else if(sth==20){
				System.out.println();
				System.out.println("   ���û����Ŷ��");
				System.out.println();
			}
		}while(imp2==1);
		
	}

}
