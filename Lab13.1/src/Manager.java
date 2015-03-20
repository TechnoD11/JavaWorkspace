public class Manager extends SalariedEmployee
{
   private double weeklyBonus;

   /**
      Constructs a manager with a given name, annual salary and weekly bonus.
      @param name the name of this employee
      @param salary the annual salary
      @param bonus the weekly bonus
    */
   public Manager(String name, double salary, double bonus)
   {
      super(name, salary);
      weeklyBonus = bonus;
   }

   public double weeklyPay(int hours)
   {
      return super.weeklyPay(hours) + weeklyBonus;
   }
}


