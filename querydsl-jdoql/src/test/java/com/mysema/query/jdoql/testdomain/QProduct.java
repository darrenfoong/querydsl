package com.mysema.query.jdoql.testdomain;

import com.mysema.query.types.path.*;

/**
 * QProduct is a Querydsl query type for Product
 *
 */
public class QProduct extends PEntity<com.mysema.query.jdoql.testdomain.Product>{
    public static final QProduct product = new QProduct("product");
    public final PString description = _string("description");
    public final PString name = _string("name");
    public final PDateTime<java.util.Date> publicationDate = _dateTime("publicationDate",java.util.Date.class);
    public final PNumber<java.lang.Integer> amount = _number("amount",java.lang.Integer.class);
    public final PNumber<java.lang.Double> price = _number("price",java.lang.Double.class);
    
    public QProduct(java.lang.String path) {
          this(com.mysema.query.jdoql.testdomain.Product.class, path);        
    }
    public QProduct(Class<? extends com.mysema.query.jdoql.testdomain.Product> cl, java.lang.String path) {
          super(cl, "Product", path);
    }    
    public QProduct(PathMetadata<?> metadata) {
         super(com.mysema.query.jdoql.testdomain.Product.class, "Product", metadata);
    }
}
