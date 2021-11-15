package Magento;


	
	public class DelimitedToXls {
	    @SuppressWarnings("deprecation")
	    public static void main(String args[]) throws IOException {
	        ArrayList<ArrayList<String>> allRowAndColData = null;
	        ArrayList<String> oneRowData = null;
	        String fName = "C:\\input.csv";
	        String currentLine;
	        FileInputStream fis = new FileInputStream(fName);
	        DataInputStream myInput = new DataInputStream(fis);
	        int i = 0;
	        allRowAndColData = new ArrayList<ArrayList<String>>();
	        while ((currentLine = myInput.readLine()) != null) {
	            oneRowData = new ArrayList<String>();
	            String oneRowArray[] = currentLine.split(";");
	            for (int j = 0; j < oneRowArray.length; j++) {
	                oneRowData.add(oneRowArray[j]);
	            }
	            allRowAndColData.add(oneRowData);
	            System.out.println();
	            i++;
	        }

	     try {
	         HSSFWorkbook workBook = new HSSFWorkbook();
	         HSSFSheet sheet = workBook.createSheet("sheet1");
	         for (int i = 0; i < allRowAndColData.size(); i++) {
	           ArrayList<?> ardata = (ArrayList<?>) allRowAndColData.get(i);
	           HSSFRow row = sheet.createRow((short) 0 + i);
	           for (int k = 0; k < ardata.size(); k++) {
	                System.out.print(ardata.get(k));
	                HSSFCell cell = row.createCell((short) k);
	                cell.setCellValue(ardata.get(k).toString());
	           }
	           System.out.println();
	         }
	       FileOutputStream fileOutputStream =  new FileOutputStream("C:\\outputFile.xls");
	       workBook.write(fileOutputStream);
	       fileOutputStream.close();
	    } catch (Exception ex) {
	   }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
