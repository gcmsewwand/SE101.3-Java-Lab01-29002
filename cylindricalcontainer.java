
package javaapplication15;
public class cylindricalcontainer extends container
{
private double height,radious;

public double volume()
{return 3.1454f*radious*radious*height;}

public cylindricalcontainer(double height,double radious)
{this.height=height;
this.radious=radious;
}
}


