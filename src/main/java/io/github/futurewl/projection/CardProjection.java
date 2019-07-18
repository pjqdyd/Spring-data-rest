package io.github.futurewl.projection;

import io.github.futurewl.entity.Card;
import org.springframework.data.rest.core.config.Projection;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Projection(name = "base", types = {Card.class})
public interface CardProjection {

    String getNumber();

}
