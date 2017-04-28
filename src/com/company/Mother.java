package com.company;

/**
 * Created by RENT on 2017-04-28.
 */
public class Mother {
  public void serviceBaby(Baby baby){
      System.out.println("Baby serviced: " + baby.getName());
      baby.feed2(3);
  }
}
