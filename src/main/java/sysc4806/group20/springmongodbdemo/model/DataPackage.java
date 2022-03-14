package sysc4806.group20.springmongodbdemo.model;

import org.springframework.data.mongodb.core.mapping.Document;


@lombok.Data
@Document
public class DataPackage {
    private Long userId;
    private Data requestBody;

    public DataPackage(Data requestBody, Long userId){
        this.requestBody = requestBody;
        this.userId = userId;
    }
}
