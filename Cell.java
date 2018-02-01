
public class Cell
{
 private String status;
 public Cell()
 {
  status = "Free";
 }

 public boolean isFree()
 {
  if(status=="Free")
   return true;
  else
   return false;
 }
}
