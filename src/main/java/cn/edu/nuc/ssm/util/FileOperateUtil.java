package cn.edu.nuc.ssm.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import cn.edu.nuc.ssm.model.Data;

public class FileOperateUtil {

	private static final String REALNAME = "realName";		
	private static final String STORENAME = "storeName";  
    private static final String SIZE = "size";  
    private static final String SUFFIX = "suffix";  
    private static final String CONTENTTYPE = "contentType";  
    private static final String CREATETIME = "createTime";  
    private static final String UPLOADDIR = "uploadDir/"; 
    
    /**
     * 上传文件重命名
     * @param name
     * @return
     */
    private static String rename(String name){
    	
    	Long now = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
    	
    	Long random = (long)(Math.random()*now);//随机数乘以时间
    	
    	String fileName = now + "" + random;
    	
    	if(name.indexOf(".") != -1){
    		
    		fileName += name.substring(name.lastIndexOf("."));
    		
    	}
    	
    	return fileName;
    }
    
    
    
    public static void upload(
    		HttpServletRequest request
    		) throws IOException{
    	
    	 Data aowu = new Data();
    	
    	 MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request; 
    	 
    	 Map<String, MultipartFile> fileMap = mRequest.getFileMap();
    	 
    	 /*String uploadDir = request.getSession().getServletContext()  
                 .getRealPath("/")  
                 + FileOperateUtil.UPLOADDIR;*/  
    	 String uploadDir = "I:/upload/";
    	 
         File file = new File(uploadDir);  
   
         if (!file.exists()) {  
             file.mkdir();  
         }  
         
         String fileName = null;  
         
         for (Map.Entry<String, MultipartFile> it : fileMap.entrySet()) {  
         
        	 
        	 MultipartFile mFile = it.getValue();
        	 
        	 if(mFile.getSize() != 0 && !"".equals(mFile.getName())){
        	 
        	 fileName = mFile.getOriginalFilename();
        	 
        	 String storeName = rename(fileName);
        	 
        	 File uploadFile = new File(uploadDir+storeName);
        	 
        	 FileCopyUtils.copy(mFile.getBytes(), uploadFile);
        	 
        	 System.out.println("上传地址为"+uploadDir);
        	 }
         }
         
    }
    
    
}
