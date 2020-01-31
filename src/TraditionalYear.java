public class TraditionalYear {
    String convert(int query)
    {
        //因为没有公元0年得说法，公元1年前一年为公元前1年
        if(query==0){
            System.out.println("没有公元0年的说法，程序不予执行");
            return "";
        }
        if(query<0) query ++;
        char []tiangan={'甲','乙','丙','丁','戊','己','庚','辛','壬','癸'};
        char []dizhi={'子','丑','寅','卯','辰','巳','午','未','申','酉','戌','亥'};
        int baseline=2020;
        int ti=6,di=0;
        //大于2020(baseline)年的算法
        for(int i=0;i<query-baseline;i++){
            ti=(ti+1)%10;
            di=(di+1)%12;
        }
        //小于2020(baseline)年的算法
        for(int i=0;i<baseline-query;i++){
            ti=(ti+10-1)%10;
            di=(di+12-1)%12;
        }
        return tiangan[ti]+Character.toString(dizhi[di]);
    }
    public static void main(String[]args){
        int query=1894;
        TraditionalYear tr=new TraditionalYear();
        String res=tr.convert(query);
        System.out.println("公元"+query+"年的天干地支纪年法表示为:"+res);
    }
}
