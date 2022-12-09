package org.example;
public class PaginationService {
  private String[] data;
  private int elementsPerPage;

  public PaginationService(String[] data, int elementsPerPage) {
    this.data = data;
    this.elementsPerPage = elementsPerPage;
  }

  // create getElementsCount() method
  public int getElementsCount() {
    return 1; //this.data.lenght;
  }

  // create getPageNumberByElementIndex(int index) method
  public int getPageNumberByElementIndex(int index) {
  System.out.println(this.data.length);
  // return ((int) (this.data.lenght * this.elementsPerPage) / 2);
   return 1;
  }
}