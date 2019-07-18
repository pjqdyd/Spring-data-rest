package io.github.futurewl.projection;

import io.github.futurewl.entity.Card;
import io.github.futurewl.entity.Person;
import org.springframework.data.rest.core.config.Projection;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Projection(name = "base", types = {Person.class})
public interface PersonProjection {

    String getName();

    Integer getAge();

    @Projection(name = "summaryCard", types = Card.class)
    interface SummaryCard extends CardProjection {

    }

    SummaryCard getCard();

}
