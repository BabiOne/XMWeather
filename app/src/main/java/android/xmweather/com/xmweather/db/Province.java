package android.xmweather.com.xmweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created on 2018/3/21 19:55
 *
 * @Author xiaoming
 * @emile xiaoming3C@126.com
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }

}
