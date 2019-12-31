package com.eprobj.dao;
import com.eprobj.entity.BookOrgLocal;
import com.eprobj.entity.NEWS;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by WFX1024 on 2018/11/24.
 */
@Repository
public interface DwLxkMapper {

    List<BookOrgLocal> newsList ( BookOrgLocal bookOrgLocal );

    int delete ( @Param("newsIds")List<String> newsIds);

    int countAll( BookOrgLocal bookOrgLocal);
}

