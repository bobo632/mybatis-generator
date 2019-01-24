package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TEmp;
import pojo.TEmpExample;

public interface TEmpMapper {
    long countByExample(TEmpExample example);

    int deleteByExample(TEmpExample example);

    int deleteByPrimaryKey(Short id);

    int insert(TEmp record);

    int insertSelective(TEmp record);

    List<TEmp> selectByExample(TEmpExample example);

    TEmp selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") TEmp record, @Param("example") TEmpExample example);

    int updateByExample(@Param("record") TEmp record, @Param("example") TEmpExample example);

    int updateByPrimaryKeySelective(TEmp record);

    int updateByPrimaryKey(TEmp record);
}