package com.jimi.spring.framework.dataaccess.jdbc.object;

import com.jimi.spring.framework.dataaccess.jdbc.domain.Title;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
public final class TitleMapper implements RowMapper<Title> {
public Title mapRow(ResultSet rs, int rowNum) throws SQLException {
Title title = new Title();
title.setId(rs.getLong("id"));
title.setName(rs.getString("name"));
return title;
}
}