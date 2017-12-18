package Transformation;

import cucumber.api.Transformer;

public
class EmailTransformation extends Transformer<String> {

    @Override
    public String transform(String username)
    {
        return username.concat("@ea.com");
    }


}
