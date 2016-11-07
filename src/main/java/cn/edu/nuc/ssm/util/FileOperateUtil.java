package cn.edu.nuc.ssm.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    
    
    
    public static List<Data> upload(
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
         Data data = new Data();
         List<Data> list = new ArrayList<>();
         
         for (Map.Entry<String, MultipartFile> it : fileMap.entrySet()) {  
         
        	 
        	 MultipartFile mFile = it.getValue();
        	 
        	 if(mFile.getSize() != 0 && !"".equals(mFile.getName())){
        	 
        	 fileName = mFile.getOriginalFilename();
        	 
        	 String storeName = rename(fileName);
        	 
        	 File uploadFile = new File(uploadDir+storeName);
        	 
        	 FileCopyUtils.copy(mFile.getBytes(), uploadFile);
        	 
        	 System.out.println("上传地址为"+uploadDir);
        	 
        	 data.setDataurl(uploadDir+storeName);
        	 
        	 data.setDataname(storeName);
        	 
        	 data.setRdataname(fileName);
        	 
        	 list.add(data);
        	 
        	 }
         }
		return list;
         
    }
    
    
    
    	public static ResponseEntity<byte[]> download(Data data) throws IOException{
		
		File file=new File(data.getDataurl());
		//处理显示中文文件名的问题
		String fileName = new String(file.getName().getBytes("utf-8"),"utf-8");
		
		//设置请求头内容，告诉浏览器代开下载窗口
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentDispositionFormData("attachment",fileName );
		//头部设置文件类型
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                headers, HttpStatus.CREATED); 
	}
    
    
}
