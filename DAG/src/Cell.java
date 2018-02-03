
public class Cell
{
 private String status;
 public Cell()
 {
  status = "Free";
 }


 
 public void setCoupler()
 {
  status="Coupler";
 }
 
 public char print()
 {
  char cell='-';
  switch(status)
  {
   case "Free":
    cell='-';
    break;
   case "Coupler":
	cell='@';
	break;
  }
  return cell;
 }
}
