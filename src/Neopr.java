public class Neopr {
    public static void main(String[] args) {
        //double Rind = 0;
        double a = (124);
        double b = (131);
        double c = (137);
        double k = 2.26;
        int P = 95;
        double w = Rind(a,b,c);
        double x = U_Rind(a, b, c, Rind(a, b, c));
        double y = U_Fd(Rind(a,b,c));
        double z = U_Fc(1);
        double pU_R = U_R(x,y,z);
        double pFR =((Math.pow(x,2))/(Math.pow(pU_R,2)))*100;
        double pFD =((Math.pow(y,2))/(Math.pow(pU_R,2)))*100;
        double pFC =((Math.pow(z,2))/(Math.pow(pU_R,2)))*100;
        double rU_R = k*pU_R;
        double Veff = (Math.pow(pU_R,4)*(3-1))/Math.pow(x,4);
        System.out.println("Среднее арифметическое повторяемых измерений Rind(МОм): "+ Rind(a, b, c));
        System.out.println("Стандартная неопределённость измерений величины Rind(МОм): "+ U_Rind(a, b, c, Rind(a, b, c)));
        System.out.println("Прямоугольное распределение вероятностей FΔ: " + U_Fd(Rind(a,b,c)));
        System.out.println("Прямоугольное распределение вероятностей Fc: " + U_Fc(1));
        System.out.println("Значение : " + R_iz_okr(w,y,z));
        System.out.println("Суммарная стандартная неопределённость: " + U_R(x,y,z));
        System.out.println("--------------------------Бюджет неопределённости измерений сопротивления изоляции силового кабеля--------------------------------------------");
        System.out.println("Rind - MOм: " + w + ". Нормальное распределение.    Стандартная неопределённость: " + x + ".  Процентный вклад, %: "+ pFR);
        System.out.println("FΔ   - MOм: " + "0,0               " + ". Прямоугольное распределение. Стандартная неопределённость: " + y + ". Процентный вклад, %: "+ pFD);
        System.out.println("Fc   - MOм: " + "0,0               " + ". Прямоугольное распределение. Стандартная неопределённость: " + z + ". Процентный вклад, %: "+ pFC);
        System.out.println("Rind - MOм: " + w + ". Стьюдента.                   Стандартная неопределённость: " + pU_R + ".  Процентный вклад, %: " + ((pFR+pFD+pFC)));
        System.out.println("Расширенная неопределённость: " + rU_R);
        System.out.println("Число эффективных степеней свободы: " + Veff);
        System.out.println("Сопротивление изоляции силового кабеля составило: ("+w+"±"+rU_R+") МОм (k = "+k+", Veff = "+Veff+", P = "+P);

    }
    //среднее арифметическое повторяемых измерений Rind(МОм)
    static double Rind(double m1, double m2, double m3) {
        double rezult = (m1 + m2 + m3) / 3;
        return rezult;
    }
    //Стандартная неопределённость измерений величины Rind(МОм)
    static double U_Rind(double m1, double m2, double m3, double Rind) {
        double rezult = Math.sqrt(((Math.pow((m1 - Rind),2)+Math.pow((m2 - Rind),2)+Math.pow((m3 - Rind), 2)) / (3*(3-1))));
        return rezult;
    }
    //Прямоугольное распределение вероятностей FΔ
    static double U_Fd(double Rind){
        double rezult = (0.03*Rind+3)/Math.sqrt(3);
        return rezult;
    }
    //Прямоугольное распределение вероятностей Fc
    static double U_Fc(double stdrt){
        double rezult = (stdrt/(2*(Math.sqrt(3))));
        return rezult;
    }
    static double R_iz_okr(double m1, double m2, double m3){
        double rezult = (m1+m2+m3);
        return rezult;
    }
    //Суммарная стандартная неопределённость
    static double U_R(double m1, double m2, double m3){
        double rezult = Math.sqrt((((Math.pow(m1,2))+(Math.pow(m2,2))+(Math.pow(m3,2)))));
        return rezult;
    }
    //Процентные вклады неопределённостей влияющих величин в суммарную стандартную неопределённость u(R)
    static double P_Fr(double m1, double m2, double m3){
        double rezult = Math.sqrt((((Math.pow(m1,2))+(Math.pow(m2,2))+(Math.pow(m3,2)))));
        return rezult;
    }
    static double P_Fd(double m1, double m2, double m3){
        double rezult = Math.sqrt((((Math.pow(m1,2))+(Math.pow(m2,2))+(Math.pow(m3,2)))));
        return rezult;
    }
    static double P_Fc(double m1, double m2, double m3){
        double rezult = Math.sqrt((((Math.pow(m1,2))+(Math.pow(m2,2))+(Math.pow(m3,2)))));
        return rezult;
    }








}
