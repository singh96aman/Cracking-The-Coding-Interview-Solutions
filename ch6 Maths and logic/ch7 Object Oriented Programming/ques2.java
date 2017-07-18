class Employee{
  String Employees[];
  boolean isFree[];
  int noOfEmployee;

  Employee(int n, boolean timeTable[], String temp[])
  {
    noOfEmployee = n;
    Employees = temp;
    isFree = timeTable;
  }

  boolean dispatchCall(){
      for(int i=0; i<noOfEmployee; i++){
        if(isFree[i])
        {
          isFree[i]=false;
          System.out.println("Call directed to "+Employees[i]);
          return true;
        }
      }
      return false;
  }
}

class ques2{
  public static void main(String[] args) {

    int size = 5;
    String temp[] = {"aman","singh","thakur","likes","coding"};
    boolean Free[] = {false, false, false, true, true};

    Employee Respondent = new Employee(size,Free,temp);

    size = 2;
    temp = new String[]{"Microsoft","Amazon"};
    //Important JAVA Note ^
    Free = new boolean[]{false, true};

    Employee Manager = new Employee(size, Free, temp);

    size = 1;
    temp = new String[]{"TCS"};
    Free = new boolean[]{true};

    Employee Director = new Employee(size, Free, temp);

    for(int i=0; i<5; i++)
    {
      if(!Respondent.dispatchCall())
        if(!Manager.dispatchCall())
          if(!Director.dispatchCall())
            System.out.println("Nobody is free to take the call!");
    }

  }
}
