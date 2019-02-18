package global;

/** 
 * Enumeration class for IndexType
 * 
 */

public class IndexType {

  public static final int None    = 0;
  public static final int B_Index = 1;
  public static final int Hash    = 2;
  public static final int ZIndex = 3;

  public int indexType;

  /** 
   * IndexType Constructor
   * <br>
   * An index type can be defined as 
   * <ul>
   * <li>   IndexType indexType = new IndexType(IndexType.Hash);
   * </ul>
   * and subsequently used as
   * <ul>
   * <li>   if (indexType.indexType == IndexType.Hash) ....
   * </ul>
   *
   * @param _indexType The possible types of index
   */

  public IndexType (int _indexType) {
    indexType = _indexType;
  }

    public String toString() {

    switch (indexType) {
    case None:
      return "None";
    case B_Index:
      return "B_Index";
    case Hash:
      return "Hash";
      case ZIndex:
        return "ZIndex";
    }
    return ("Unexpected IndexType " + indexType);
  }
}