package Magento;


	public void OpenFile(String fileName)
	{
	    try
	    {
	        subFile = new Scanner (new File(fileName));
	    }
	    catch (Exception e)
	    {
	        System.out.println("File dosn't exist.");
	    }
	}
	public String[] TextToCsvArray(String[] fileArray)
	{
	    int i=0;
	    while(subFile.hasNext())
	    {
	        String line = subFile.nextLine();            
	        String[] split = line.split("\\s+");            
	        StringJoiner joiner = new StringJoiner(",");

	        for (String strVal: split)
	            joiner.add(strVal);

	        line = joiner.toString();
	        line = line.startsWith(",") ? line.substring(1) : line;
	        fileArray[i++] = line;            
	    }
	    return fileArray;
	}
	


