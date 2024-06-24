// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelCommonSpectre extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public ModelCommonSpectre() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone, -3.1416F, 0.0F, 3.1416F);
		bone.setTextureOffset(16, 46).addBox(3.0F, -28.0F, 3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 46).addBox(-7.0F, -28.0F, 3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-9.0F, -20.0F, 8.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.829F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(40, 26).addBox(6.0F, 15.9276F, -4.4716F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-9.0F, -20.0F, 8.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(36, 0).addBox(12.0F, 4.5774F, -4.0937F, 4.0F, 4.0F, 8.0F, 0.0F, false);
		cube_r2.setTextureOffset(32, 38).addBox(2.0F, 5.0F, -5.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-9.0F, -20.0F, 8.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 26).addBox(4.0F, 5.2158F, -12.1669F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-9.0F, -20.0F, 8.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(3.0F, -12.0F, -14.0F, 12.0F, 14.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}